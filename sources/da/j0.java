package da;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f8053a;
    public final byte[] f8054b;

    public j0(String str, byte[] bArr) {
        this.f8053a = str;
        this.f8054b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f8053a.equals(j0Var.f8053a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f8054b;
                } else {
                    bArr = j0Var.f8054b;
                }
                if (Arrays.equals(this.f8054b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8053a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8054b);
    }

    public final String toString() {
        return "File{filename=" + this.f8053a + ", contents=" + Arrays.toString(this.f8054b) + "}";
    }
}
