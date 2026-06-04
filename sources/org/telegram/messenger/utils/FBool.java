package org.telegram.messenger.utils;

import androidx.core.math.MathUtils;

public abstract class FBool {
    public static float not(float f) {
        return 1.0f - clamp(f);
    }

    public static float and(float f, float f2) {
        return Math.min(clamp(f), clamp(f2));
    }

    public static float or(float f, float f2) {
        return not(and(not(f), not(f2)));
    }

    private static float clamp(float f) {
        return MathUtils.clamp(f, 0.0f, 1.0f);
    }
}
