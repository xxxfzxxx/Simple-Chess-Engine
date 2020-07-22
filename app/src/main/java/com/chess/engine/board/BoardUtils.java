package com.chess.engine.board;

public class BoardUtils {

    public static final boolean FIRST_COLUMN = null;
    public static final boolean SECOND_COLUMN = ;
    public static final boolean SEVENTH_COLUMN = ;
    public static final boolean EIGHTH_COLUMN = ;

    private BoardUtils() {
        throw new RuntimeException("You cannot instantiate me!");
    }

    public static boolean isValidTileCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }
}
