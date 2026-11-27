package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.zip.CRC32;
public abstract class hid {
    public static final byte[] a = {-119, 80, 78, 71, 13, 10, 26, 10};

    public static long a(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static void b(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >>> 24);
        bArr[i + 1] = (byte) (j >>> 16);
        bArr[i + 2] = (byte) (j >>> 8);
        bArr[i + 3] = (byte) j;
    }

    public static boolean c(int i, String str, byte[] bArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (bArr[i + i2] != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr, CRC32 crc32) {
        byte[] bArr2 = new byte[8];
        b(bArr.length, bArr2, 0);
        for (int i = 0; i < 4; i++) {
            bArr2[i + 4] = (byte) str.charAt(i);
        }
        byteArrayOutputStream.write(bArr2, 0, 8);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        crc32.reset();
        crc32.update(bArr2, 4, 4);
        crc32.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[4];
        b(crc32.getValue(), bArr3, 0);
        byteArrayOutputStream.write(bArr3, 0, 4);
    }
}
