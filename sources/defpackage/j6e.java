package defpackage;
public abstract class j6e {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof j6e) {
            byte[] bArr = ((e6e) this).b;
            int length = bArr.length << 3;
            byte[] bArr2 = ((e6e) ((j6e) obj)).b;
            if (length == (bArr2.length << 3)) {
                if (bArr.length == bArr2.length) {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        if (bArr[i] == bArr2[i]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z &= z2;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((e6e) this).b;
        if ((bArr.length << 3) >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
            }
            dq9.m(n2f.a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((e6e) this).b;
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
