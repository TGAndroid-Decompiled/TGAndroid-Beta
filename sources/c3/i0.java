package c3;

import java.util.Arrays;
public final class i0 {
    public final int f4628a;
    public final byte[] f4629b;
    public final int f4630c;
    public final int d;

    public i0(int i10, int i11, int i12, byte[] bArr) {
        this.f4628a = i10;
        this.f4629b = bArr;
        this.f4630c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f4628a == i0Var.f4628a && this.f4630c == i0Var.f4630c && this.d == i0Var.d && Arrays.equals(this.f4629b, i0Var.f4629b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4629b) + (this.f4628a * 31)) * 31) + this.f4630c) * 31) + this.d;
    }
}
