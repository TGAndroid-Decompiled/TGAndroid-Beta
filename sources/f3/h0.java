package f3;

import java.util.Arrays;
public final class h0 {
    public final int f11161a;
    public final byte[] f11162b;
    public final int f11163c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.f11161a = i7;
        this.f11162b = bArr;
        this.f11163c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f11161a == h0Var.f11161a && this.f11163c == h0Var.f11163c && this.d == h0Var.d && Arrays.equals(this.f11162b, h0Var.f11162b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11162b) + (this.f11161a * 31)) * 31) + this.f11163c) * 31) + this.d;
    }
}
