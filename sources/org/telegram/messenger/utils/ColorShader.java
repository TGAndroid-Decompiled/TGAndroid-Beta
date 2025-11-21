package org.telegram.messenger.utils;

import android.graphics.LinearGradient;
import android.graphics.Shader;

public class ColorShader extends LinearGradient {
    public ColorShader(int i) {
        super(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i, i}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
