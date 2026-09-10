package n7;
public abstract class g0 {
    public static final char[] f13951a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj instanceof g0) {
            byte[] bArr = ((f0) this).f13947b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((f0) ((g0) obj)).f13947b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z10 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        if (bArr[i10] == bArr2[i10]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 &= z11;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((f0) this).f13947b;
        if (bArr.length * 8 >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(a.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArr = ((f0) this).f13947b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f13951a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
