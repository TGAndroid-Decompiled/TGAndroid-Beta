package org.telegram.messenger;

import android.graphics.Color;

public class Intro {
    public static native void onDrawFrame(int i);

    public static native void onSurfaceChanged(int i, int i2, float f, int i3);

    public static native void onSurfaceCreated();

    private static native void setBackgroundColor(float f, float f2, float f3, float f4);

    public static native void setDate(float f);

    public static native void setFastTextures(int i, int i2, int i3, int i4);

    public static native void setFreeTextures(int i, int i2);

    public static native void setIcTextures(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native void setPage(int i);

    public static native void setPowerfulTextures(int i, int i2, int i3, int i4);

    public static native void setPrivateTextures(int i, int i2);

    public static native void setScrollOffset(float f);

    public static native void setTelegramTextures(int i, int i2, int i3);

    public static void setBackgroundColor(int i) {
        setBackgroundColor(Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
    }
}
