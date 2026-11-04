package org.telegram.messenger;

import android.graphics.Bitmap;
public abstract class kb {
    public static final int[] f23808a;

    static {
        Bitmap.CompressFormat compressFormat;
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        f23808a = iArr;
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = f23808a;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            iArr2[compressFormat.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23808a[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
