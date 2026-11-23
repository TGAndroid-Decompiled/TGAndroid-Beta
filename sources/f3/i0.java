package f3;

import java.util.Arrays;
public final class i0 {
    public final int f11160a;
    public final byte[] f11161b;
    public final int f11162c;
    public final int d;

    public i0(int i7, int i10, int i11, byte[] bArr) {
        this.f11160a = i7;
        this.f11161b = bArr;
        this.f11162c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f11160a == i0Var.f11160a && this.f11162c == i0Var.f11162c && this.d == i0Var.d && Arrays.equals(this.f11161b, i0Var.f11161b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11161b) + (this.f11160a * 31)) * 31) + this.f11162c) * 31) + this.d;
    }
}
