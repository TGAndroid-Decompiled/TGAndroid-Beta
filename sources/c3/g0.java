package c3;

import java.util.Arrays;
public final class g0 {
    public final int f3759a;
    public final byte[] f3760b;
    public final int f3761c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f3759a = i10;
        this.f3760b = bArr;
        this.f3761c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f3759a == g0Var.f3759a && this.f3761c == g0Var.f3761c && this.d == g0Var.d && Arrays.equals(this.f3760b, g0Var.f3760b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3760b) + (this.f3759a * 31)) * 31) + this.f3761c) * 31) + this.d;
    }
}
