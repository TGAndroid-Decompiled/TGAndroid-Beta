package f3;

import java.util.Arrays;
public final class h0 {
    public final int f11193a;
    public final byte[] f11194b;
    public final int f11195c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.f11193a = i7;
        this.f11194b = bArr;
        this.f11195c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f11193a == h0Var.f11193a && this.f11195c == h0Var.f11195c && this.d == h0Var.d && Arrays.equals(this.f11194b, h0Var.f11194b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11194b) + (this.f11193a * 31)) * 31) + this.f11195c) * 31) + this.d;
    }
}
