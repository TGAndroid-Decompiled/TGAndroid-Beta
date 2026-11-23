package da;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f8047a;
    public final byte[] f8048b;

    public j0(String str, byte[] bArr) {
        this.f8047a = str;
        this.f8048b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f8047a.equals(j0Var.f8047a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f8048b;
                } else {
                    bArr = j0Var.f8048b;
                }
                if (Arrays.equals(this.f8048b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8047a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8048b);
    }

    public final String toString() {
        return "File{filename=" + this.f8047a + ", contents=" + Arrays.toString(this.f8048b) + "}";
    }
}
