package c3;

import java.util.Arrays;
public final class g0 {
    public final int f4179a;
    public final byte[] f4180b;
    public final int f4181c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f4179a = i10;
        this.f4180b = bArr;
        this.f4181c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f4179a == g0Var.f4179a && this.f4181c == g0Var.f4181c && this.d == g0Var.d && Arrays.equals(this.f4180b, g0Var.f4180b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4180b) + (this.f4179a * 31)) * 31) + this.f4181c) * 31) + this.d;
    }
}
