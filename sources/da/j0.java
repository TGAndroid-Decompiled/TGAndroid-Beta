package da;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f8384a;
    public final byte[] f8385b;

    public j0(String str, byte[] bArr) {
        this.f8384a = str;
        this.f8385b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f8384a.equals(j0Var.f8384a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f8385b;
                } else {
                    bArr = j0Var.f8385b;
                }
                if (Arrays.equals(this.f8385b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8384a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8385b);
    }

    public final String toString() {
        return "File{filename=" + this.f8384a + ", contents=" + Arrays.toString(this.f8385b) + "}";
    }
}
