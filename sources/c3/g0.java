package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4112a;
    public final byte[] f4113b;
    public final int f4114c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4112a = i10;
        this.f4113b = bArr;
        this.f4114c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4112a == g0Var.f4112a && this.f4114c == g0Var.f4114c && this.d == g0Var.d && Arrays.equals(this.f4113b, g0Var.f4113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4113b) + (this.f4112a * 31)) * 31) + this.f4114c) * 31) + this.d;
    }
}
