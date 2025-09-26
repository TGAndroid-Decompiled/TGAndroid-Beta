package me.vkryl.core;

public abstract class BitwiseUtils {
    public static boolean hasFlag(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int setFlag(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }
}
