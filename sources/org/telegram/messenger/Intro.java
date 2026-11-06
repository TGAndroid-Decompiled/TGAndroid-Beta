package org.telegram.messenger;

import android.graphics.Color;
public class Intro {
    public static void a(int i7) {
        setBackgroundColor(Color.red(i7) / 255.0f, Color.green(i7) / 255.0f, Color.blue(i7) / 255.0f, Color.alpha(i7) / 255.0f);
    }

    public static native void onDrawFrame(int i7);

    public static native void onSurfaceChanged(int i7, int i10, float f10, int i11);

    public static native void onSurfaceCreated();

    private static native void setBackgroundColor(float f10, float f11, float f12, float f13);

    public static native void setDate(float f10);

    public static native void setFastTextures(int i7, int i10, int i11, int i12);

    public static native void setFreeTextures(int i7, int i10);

    public static native void setIcTextures(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    public static native void setPage(int i7);

    public static native void setPowerfulTextures(int i7, int i10, int i11, int i12);

    public static native void setPrivateTextures(int i7, int i10);

    public static native void setScrollOffset(float f10);

    public static native void setTelegramTextures(int i7, int i10, int i11);
}
