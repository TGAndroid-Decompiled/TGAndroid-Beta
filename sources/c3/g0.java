package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4285a;
    public final byte[] f4286b;
    public final int f4287c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4285a = i10;
        this.f4286b = bArr;
        this.f4287c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4285a == g0Var.f4285a && this.f4287c == g0Var.f4287c && this.d == g0Var.d && Arrays.equals(this.f4286b, g0Var.f4286b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4286b) + (this.f4285a * 31)) * 31) + this.f4287c) * 31) + this.d;
    }
}
