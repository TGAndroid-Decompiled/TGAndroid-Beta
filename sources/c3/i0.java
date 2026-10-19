package c3;

import java.util.Arrays;
public final class i0 {
    public final int f4627a;
    public final byte[] f4628b;
    public final int f4629c;
    public final int d;

    public i0(int i10, int i11, int i12, byte[] bArr) {
        this.f4627a = i10;
        this.f4628b = bArr;
        this.f4629c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f4627a == i0Var.f4627a && this.f4629c == i0Var.f4629c && this.d == i0Var.d && Arrays.equals(this.f4628b, i0Var.f4628b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4628b) + (this.f4627a * 31)) * 31) + this.f4629c) * 31) + this.d;
    }
}
