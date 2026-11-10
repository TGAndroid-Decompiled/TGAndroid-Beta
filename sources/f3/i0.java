package f3;

import java.util.Arrays;
public final class i0 {
    public final int f11040a;
    public final byte[] f11041b;
    public final int f11042c;
    public final int d;

    public i0(int i7, int i10, int i11, byte[] bArr) {
        this.f11040a = i7;
        this.f11041b = bArr;
        this.f11042c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f11040a == i0Var.f11040a && this.f11042c == i0Var.f11042c && this.d == i0Var.d && Arrays.equals(this.f11041b, i0Var.f11041b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11041b) + (this.f11040a * 31)) * 31) + this.f11042c) * 31) + this.d;
    }
}
