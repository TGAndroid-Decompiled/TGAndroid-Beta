package f3;

import java.util.Arrays;
public final class i0 {
    public final int f11035a;
    public final byte[] f11036b;
    public final int f11037c;
    public final int d;

    public i0(int i7, int i10, int i11, byte[] bArr) {
        this.f11035a = i7;
        this.f11036b = bArr;
        this.f11037c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f11035a == i0Var.f11035a && this.f11037c == i0Var.f11037c && this.d == i0Var.d && Arrays.equals(this.f11036b, i0Var.f11036b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11036b) + (this.f11035a * 31)) * 31) + this.f11037c) * 31) + this.d;
    }
}
