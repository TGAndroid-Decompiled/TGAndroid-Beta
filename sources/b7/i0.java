package b7;
public abstract class i0 {
    public static final char[] f1823a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z10;
        if (obj instanceof i0) {
            byte[] bArr = ((h0) this).f1821b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((h0) ((i0) obj)).f1821b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z4 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        if (bArr[i10] == bArr2[i10]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z4 &= z10;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((h0) this).f1821b;
        if (bArr.length * 8 >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(b.d("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArr = ((h0) this).f1821b;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f1823a;
            sb.append(cArr[(b10 >> 4) & 15]);
            sb.append(cArr[b10 & 15]);
        }
        return sb.toString();
    }
}
