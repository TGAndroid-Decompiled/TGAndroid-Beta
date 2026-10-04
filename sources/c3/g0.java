package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4064a;
    public final byte[] f4065b;
    public final int f4066c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4064a = i10;
        this.f4065b = bArr;
        this.f4066c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4064a == g0Var.f4064a && this.f4066c == g0Var.f4066c && this.d == g0Var.d && Arrays.equals(this.f4065b, g0Var.f4065b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4065b) + (this.f4064a * 31)) * 31) + this.f4066c) * 31) + this.d;
    }
}
