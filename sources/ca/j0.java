package ca;

import java.util.Arrays;
public final class j0 extends w1 {
    public final String f4410a;
    public final byte[] f4411b;

    public j0(String str, byte[] bArr) {
        this.f4410a = str;
        this.f4411b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f4410a.equals(j0Var.f4410a)) {
                if (w1Var instanceof j0) {
                    bArr = ((j0) w1Var).f4411b;
                } else {
                    bArr = j0Var.f4411b;
                }
                if (Arrays.equals(this.f4411b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4410a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4411b);
    }

    public final String toString() {
        return "File{filename=" + this.f4410a + ", contents=" + Arrays.toString(this.f4411b) + "}";
    }
}
