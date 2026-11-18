package da;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f8056a;
    public final byte[] f8057b;

    public j0(String str, byte[] bArr) {
        this.f8056a = str;
        this.f8057b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f8056a.equals(j0Var.f8056a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f8057b;
                } else {
                    bArr = j0Var.f8057b;
                }
                if (Arrays.equals(this.f8057b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8056a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8057b);
    }

    public final String toString() {
        return "File{filename=" + this.f8056a + ", contents=" + Arrays.toString(this.f8057b) + "}";
    }
}
