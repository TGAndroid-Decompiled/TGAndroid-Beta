package e3;

import java.util.Arrays;
public final class h0 {
    public final int f9471a;
    public final byte[] f9472b;
    public final int f9473c;
    public final int d;

    public h0(int i3, int i10, int i11, byte[] bArr) {
        this.f9471a = i3;
        this.f9472b = bArr;
        this.f9473c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f9471a == h0Var.f9471a && this.f9473c == h0Var.f9473c && this.d == h0Var.d && Arrays.equals(this.f9472b, h0Var.f9472b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9472b) + (this.f9471a * 31)) * 31) + this.f9473c) * 31) + this.d;
    }
}
