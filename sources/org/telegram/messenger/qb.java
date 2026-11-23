package org.telegram.messenger;

import android.graphics.Bitmap;
public abstract class qb {
    public static final int[] f26421a;

    static {
        Bitmap.CompressFormat compressFormat;
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        f26421a = iArr;
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = f26421a;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            iArr2[compressFormat.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26421a[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
