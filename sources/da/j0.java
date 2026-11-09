package da;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f8382a;
    public final byte[] f8383b;

    public j0(String str, byte[] bArr) {
        this.f8382a = str;
        this.f8383b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f8382a.equals(j0Var.f8382a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f8383b;
                } else {
                    bArr = j0Var.f8383b;
                }
                if (Arrays.equals(this.f8383b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8382a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8383b);
    }

    public final String toString() {
        return "File{filename=" + this.f8382a + ", contents=" + Arrays.toString(this.f8383b) + "}";
    }
}
