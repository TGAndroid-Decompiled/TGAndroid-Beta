package c3;

import java.util.Arrays;
public final class g0 {
    public final int f3765a;
    public final byte[] f3766b;
    public final int f3767c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f3765a = i10;
        this.f3766b = bArr;
        this.f3767c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f3765a == g0Var.f3765a && this.f3767c == g0Var.f3767c && this.d == g0Var.d && Arrays.equals(this.f3766b, g0Var.f3766b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3766b) + (this.f3765a * 31)) * 31) + this.f3767c) * 31) + this.d;
    }
}
