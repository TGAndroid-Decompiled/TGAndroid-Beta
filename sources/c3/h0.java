package c3;

import java.util.Arrays;
public final class h0 {
    public final int f4249a;
    public final byte[] f4250b;
    public final int f4251c;
    public final int d;

    public h0(int i10, int i11, int i12, byte[] bArr) {
        this.f4249a = i10;
        this.f4250b = bArr;
        this.f4251c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f4249a == h0Var.f4249a && this.f4251c == h0Var.f4251c && this.d == h0Var.d && Arrays.equals(this.f4250b, h0Var.f4250b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4250b) + (this.f4249a * 31)) * 31) + this.f4251c) * 31) + this.d;
    }
}
