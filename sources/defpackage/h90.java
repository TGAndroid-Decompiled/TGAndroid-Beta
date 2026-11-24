package defpackage;

import java.util.Arrays;
public final class h90 extends uz2 {
    public final String a;
    public final byte[] b;

    public h90(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof uz2) {
                uz2 uz2Var = (uz2) obj;
                h90 h90Var = (h90) uz2Var;
                if (this.a.equals(h90Var.a)) {
                    if (uz2Var instanceof h90) {
                        h90Var = (h90) uz2Var;
                    }
                    if (Arrays.equals(this.b, h90Var.b)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
