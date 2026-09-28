package c3;

import java.util.Arrays;
public final class g0 {
    public final int f3757a;
    public final byte[] f3758b;
    public final int f3759c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f3757a = i10;
        this.f3758b = bArr;
        this.f3759c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f3757a == g0Var.f3757a && this.f3759c == g0Var.f3759c && this.d == g0Var.d && Arrays.equals(this.f3758b, g0Var.f3758b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3758b) + (this.f3757a * 31)) * 31) + this.f3759c) * 31) + this.d;
    }
}
