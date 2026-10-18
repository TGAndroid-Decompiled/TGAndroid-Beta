package c3;

import java.util.Arrays;
public final class i0 {
    public final int f4629a;
    public final byte[] f4630b;
    public final int f4631c;
    public final int d;

    public i0(int i10, int i11, int i12, byte[] bArr) {
        this.f4629a = i10;
        this.f4630b = bArr;
        this.f4631c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f4629a == i0Var.f4629a && this.f4631c == i0Var.f4631c && this.d == i0Var.d && Arrays.equals(this.f4630b, i0Var.f4630b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4630b) + (this.f4629a * 31)) * 31) + this.f4631c) * 31) + this.d;
    }
}
