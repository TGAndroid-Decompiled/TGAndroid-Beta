package c3;

import java.util.Arrays;
public final class i0 {
    public final int f6061a;
    public final byte[] f6062b;
    public final int f6063c;
    public final int d;

    public i0(int i10, int i11, int i12, byte[] bArr) {
        this.f6061a = i10;
        this.f6062b = bArr;
        this.f6063c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f6061a == i0Var.f6061a && this.f6063c == i0Var.f6063c && this.d == i0Var.d && Arrays.equals(this.f6062b, i0Var.f6062b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6062b) + (this.f6061a * 31)) * 31) + this.f6063c) * 31) + this.d;
    }
}
