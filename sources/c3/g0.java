package c3;

import java.util.Arrays;
public final class g0 {
    public final int f3764a;
    public final byte[] f3765b;
    public final int f3766c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f3764a = i10;
        this.f3765b = bArr;
        this.f3766c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f3764a == g0Var.f3764a && this.f3766c == g0Var.f3766c && this.d == g0Var.d && Arrays.equals(this.f3765b, g0Var.f3765b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3765b) + (this.f3764a * 31)) * 31) + this.f3766c) * 31) + this.d;
    }
}
