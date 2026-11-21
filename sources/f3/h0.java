package f3;

import java.util.Arrays;
public final class h0 {
    public final int f11190a;
    public final byte[] f11191b;
    public final int f11192c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.f11190a = i7;
        this.f11191b = bArr;
        this.f11192c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f11190a == h0Var.f11190a && this.f11192c == h0Var.f11192c && this.d == h0Var.d && Arrays.equals(this.f11191b, h0Var.f11191b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11191b) + (this.f11190a * 31)) * 31) + this.f11192c) * 31) + this.d;
    }
}
