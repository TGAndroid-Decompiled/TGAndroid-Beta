package f3;

import java.util.Arrays;
public final class h0 {
    public final int f11156a;
    public final byte[] f11157b;
    public final int f11158c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.f11156a = i7;
        this.f11157b = bArr;
        this.f11158c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f11156a == h0Var.f11156a && this.f11158c == h0Var.f11158c && this.d == h0Var.d && Arrays.equals(this.f11157b, h0Var.f11157b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11157b) + (this.f11156a * 31)) * 31) + this.f11158c) * 31) + this.d;
    }
}
