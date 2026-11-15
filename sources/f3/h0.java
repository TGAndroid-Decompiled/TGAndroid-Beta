package f3;

import java.util.Arrays;
public final class h0 {
    public final int f10842a;
    public final byte[] f10843b;
    public final int f10844c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.f10842a = i7;
        this.f10843b = bArr;
        this.f10844c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f10842a == h0Var.f10842a && this.f10844c == h0Var.f10844c && this.d == h0Var.d && Arrays.equals(this.f10843b, h0Var.f10843b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10843b) + (this.f10842a * 31)) * 31) + this.f10844c) * 31) + this.d;
    }
}
