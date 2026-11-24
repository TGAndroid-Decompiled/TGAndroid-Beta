package defpackage;

import java.util.Arrays;
public final class vxb {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    public vxb(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vxb.class == obj.getClass()) {
                vxb vxbVar = (vxb) obj;
                if (this.a == vxbVar.a && this.c == vxbVar.c && this.d == vxbVar.d && Arrays.equals(this.b, vxbVar.b)) {
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
