package org.telegram.messenger;

import android.graphics.Color;
public class Intro {
    public static native void onDrawFrame(int i9);

    public static native void onSurfaceChanged(int i9, int i10, float f10, int i11);

    public static native void onSurfaceCreated();

    private static native void setBackgroundColor(float f10, float f11, float f12, float f13);

    public static void setBackgroundColor(int i9) {
        setBackgroundColor(Color.red(i9) / 255.0f, Color.green(i9) / 255.0f, Color.blue(i9) / 255.0f, Color.alpha(i9) / 255.0f);
    }

    public static native void setDate(float f10);

    public static native void setFastTextures(int i9, int i10, int i11, int i12);

    public static native void setFreeTextures(int i9, int i10);

    public static native void setIcTextures(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    public static native void setPage(int i9);

    public static native void setPowerfulTextures(int i9, int i10, int i11, int i12);

    public static native void setPrivateTextures(int i9, int i10);

    public static native void setScrollOffset(float f10);

    public static native void setTelegramTextures(int i9, int i10, int i11);
}
