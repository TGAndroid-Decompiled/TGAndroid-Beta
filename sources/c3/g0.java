package c3;

import java.util.Arrays;
public final class g0 {
    public final int f3762a;
    public final byte[] f3763b;
    public final int f3764c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f3762a = i10;
        this.f3763b = bArr;
        this.f3764c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f3762a == g0Var.f3762a && this.f3764c == g0Var.f3764c && this.d == g0Var.d && Arrays.equals(this.f3763b, g0Var.f3763b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3763b) + (this.f3762a * 31)) * 31) + this.f3764c) * 31) + this.d;
    }
}
