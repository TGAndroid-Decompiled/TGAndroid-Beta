package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4063a;
    public final byte[] f4064b;
    public final int f4065c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4063a = i10;
        this.f4064b = bArr;
        this.f4065c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4063a == g0Var.f4063a && this.f4065c == g0Var.f4065c && this.d == g0Var.d && Arrays.equals(this.f4064b, g0Var.f4064b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4064b) + (this.f4063a * 31)) * 31) + this.f4065c) * 31) + this.d;
    }
}
