package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4113a;
    public final byte[] f4114b;
    public final int f4115c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4113a = i10;
        this.f4114b = bArr;
        this.f4115c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4113a == g0Var.f4113a && this.f4115c == g0Var.f4115c && this.d == g0Var.d && Arrays.equals(this.f4114b, g0Var.f4114b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4114b) + (this.f4113a * 31)) * 31) + this.f4115c) * 31) + this.d;
    }
}
