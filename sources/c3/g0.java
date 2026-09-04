package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4258a;
    public final byte[] f4259b;
    public final int f4260c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4258a = i10;
        this.f4259b = bArr;
        this.f4260c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4258a == g0Var.f4258a && this.f4260c == g0Var.f4260c && this.d == g0Var.d && Arrays.equals(this.f4259b, g0Var.f4259b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4259b) + (this.f4258a * 31)) * 31) + this.f4260c) * 31) + this.d;
    }
}
