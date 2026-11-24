package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
public abstract class b51 {
    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        int i;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 128;
        int i3 = 0;
        while (i3 < 2147483639) {
            int min = Math.min(i2, 2147483639 - i3);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min) {
                int read = inputStream.read(bArr, i4, min - i4);
                if (read == -1) {
                    return a(arrayDeque, i3);
                }
                i4 += read;
                i3 += read;
            }
            if (i2 < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            i2 = gle.d(i2 * i);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
