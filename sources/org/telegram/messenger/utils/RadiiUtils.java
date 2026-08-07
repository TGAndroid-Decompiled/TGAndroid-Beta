package org.telegram.messenger.utils;

public abstract class RadiiUtils {
    public static boolean radiiAreSame(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return false;
        }
        float f = fArr[0];
        return f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7];
    }
}
