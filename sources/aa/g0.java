package aa;

import java.util.Arrays;
public final class g0 extends k1 {
    public final String f1088a;
    public final byte[] f1089b;

    public g0(String str, byte[] bArr) {
        this.f1088a = str;
        this.f1089b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            g0 g0Var = (g0) k1Var;
            if (this.f1088a.equals(g0Var.f1088a)) {
                if (k1Var instanceof g0) {
                    bArr = ((g0) k1Var).f1089b;
                } else {
                    bArr = g0Var.f1089b;
                }
                if (Arrays.equals(this.f1089b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1088a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1089b);
    }

    public final String toString() {
        return "File{filename=" + this.f1088a + ", contents=" + Arrays.toString(this.f1089b) + "}";
    }
}
