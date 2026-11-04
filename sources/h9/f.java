package h9;

import b8.od;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
public abstract class f {
    static {
        new OutputStream();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i3 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        int i3;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            if (min < 4096) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            min = od.e(min * i3);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
