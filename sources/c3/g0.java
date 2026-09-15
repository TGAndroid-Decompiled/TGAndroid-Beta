package c3;

import java.util.Arrays;
public final class g0 {
    public final int f3760a;
    public final byte[] f3761b;
    public final int f3762c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f3760a = i10;
        this.f3761b = bArr;
        this.f3762c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f3760a == g0Var.f3760a && this.f3762c == g0Var.f3762c && this.d == g0Var.d && Arrays.equals(this.f3761b, g0Var.f3761b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3761b) + (this.f3760a * 31)) * 31) + this.f3762c) * 31) + this.d;
    }
}
