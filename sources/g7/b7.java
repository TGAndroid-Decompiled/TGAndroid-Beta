package g7;

import java.io.Serializable;
public abstract class b7 {
    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i9 = 0; i9 < bArr.length; i9++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i9])));
        }
        return sb2.toString();
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                jArr[i9] = iArr[i9];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }
}
