package c3;

import java.util.Arrays;
public final class i0 {
    public final int f4625a;
    public final byte[] f4626b;
    public final int f4627c;
    public final int d;

    public i0(int i10, int i11, int i12, byte[] bArr) {
        this.f4625a = i10;
        this.f4626b = bArr;
        this.f4627c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f4625a == i0Var.f4625a && this.f4627c == i0Var.f4627c && this.d == i0Var.d && Arrays.equals(this.f4626b, i0Var.f4626b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4626b) + (this.f4625a * 31)) * 31) + this.f4627c) * 31) + this.d;
    }
}
