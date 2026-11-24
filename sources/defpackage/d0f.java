package defpackage;

import java.nio.ByteBuffer;
public abstract class d0f {
    public static boolean a(int i, byte[] bArr) {
        if (((bArr[i / 8] >> (7 - (i % 8))) & 1) != 0) {
            return true;
        }
        return false;
    }

    public static int b(byte[] bArr, int[] iArr) {
        int i = 0;
        if (a(0, bArr) && !a(1, bArr) && !a(2, bArr) && !a(3, bArr) && a(4, bArr) && !a(5, bArr) && !a(6, bArr)) {
            int i2 = 271;
            int i3 = 0;
            while (i < 4) {
                i3 = (i3 << 1) | (a(i2, bArr) ? 1 : 0);
                i++;
                i2++;
            }
            int i4 = i2 + (i3 << 3);
            int i5 = i4 + 1;
            if (a(i4, bArr)) {
                int i6 = i4 + 2;
                if (!a(i5, bArr)) {
                    int i7 = i4 + 3;
                    if (a(i6, bArr)) {
                        i7 = i4 + 8;
                    }
                    int i8 = i7 + 1;
                    if (a(i7, bArr)) {
                        i8 = i7 + 3;
                    }
                    i5 = i8 + 3;
                } else {
                    i5 = i6;
                }
            }
            if (a(i5, bArr) && iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
        }
        return -1;
    }

    public static void c(int i, byte[] bArr) {
        int i2 = i / 8;
        bArr[i2] = (byte) (bArr[i2] | ((byte) (1 << (7 - (i % 8)))));
    }

    public static long d(int i, ByteBuffer byteBuffer) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (byteBuffer.get() & 255);
        }
        return j;
    }
}
