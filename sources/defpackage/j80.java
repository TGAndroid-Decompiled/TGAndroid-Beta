package defpackage;

import java.util.Arrays;
public final class j80 extends ez2 {
    public final String a;
    public final byte[] b;

    public j80(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ez2) {
                ez2 ez2Var = (ez2) obj;
                j80 j80Var = (j80) ez2Var;
                if (this.a.equals(j80Var.a)) {
                    if (ez2Var instanceof j80) {
                        j80Var = (j80) ez2Var;
                    }
                    if (Arrays.equals(this.b, j80Var.b)) {
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
