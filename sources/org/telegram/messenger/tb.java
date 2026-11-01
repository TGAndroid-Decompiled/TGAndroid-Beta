package org.telegram.messenger;

import android.graphics.Bitmap;
public abstract class tb {
    public static final int[] f18236a;

    static {
        Bitmap.CompressFormat compressFormat;
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        f18236a = iArr;
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = f18236a;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            iArr2[compressFormat.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18236a[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
