package defpackage;

import java.util.Arrays;
public final class xzb {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    public xzb(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && xzb.class == obj.getClass()) {
                xzb xzbVar = (xzb) obj;
                if (this.a == xzbVar.a && this.c == xzbVar.c && this.d == xzbVar.d && Arrays.equals(this.b, xzbVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
