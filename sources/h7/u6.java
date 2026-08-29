package h7;

import java.util.ArrayDeque;
import java.util.Arrays;
public abstract class u6 {
    public static byte[] a(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(com.google.firebase.messaging.d dVar) {
        int i10;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = dVar.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return a(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            long j10 = min;
            if (min < 4096) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            long j11 = j10 * i10;
            if (j11 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j11 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j11;
            }
        }
        if (dVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
