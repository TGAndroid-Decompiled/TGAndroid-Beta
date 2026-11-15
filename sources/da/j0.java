package da;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f7774a;
    public final byte[] f7775b;

    public j0(String str, byte[] bArr) {
        this.f7774a = str;
        this.f7775b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f7774a.equals(j0Var.f7774a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f7775b;
                } else {
                    bArr = j0Var.f7775b;
                }
                if (Arrays.equals(this.f7775b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7774a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7775b);
    }

    public final String toString() {
        return "File{filename=" + this.f7774a + ", contents=" + Arrays.toString(this.f7775b) + "}";
    }
}
