package c3;

import java.util.Arrays;
public final class j0 {
    public final int f3661a;
    public final byte[] f3662b;
    public final int f3663c;
    public final int d;

    public j0(int i10, int i11, int i12, byte[] bArr) {
        this.f3661a = i10;
        this.f3662b = bArr;
        this.f3663c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f3661a == j0Var.f3661a && this.f3663c == j0Var.f3663c && this.d == j0Var.d && Arrays.equals(this.f3662b, j0Var.f3662b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3662b) + (this.f3661a * 31)) * 31) + this.f3663c) * 31) + this.d;
    }
}
