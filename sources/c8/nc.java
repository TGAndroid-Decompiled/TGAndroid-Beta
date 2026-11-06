package c8;

import java.io.Serializable;
public abstract class nc {
    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i7])));
        }
        return sb2.toString();
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                jArr[i7] = iArr[i7];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }
}
