package f3;

import java.util.Arrays;
public final class h0 {
    public final int f11164a;
    public final byte[] f11165b;
    public final int f11166c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.f11164a = i7;
        this.f11165b = bArr;
        this.f11166c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f11164a == h0Var.f11164a && this.f11166c == h0Var.f11166c && this.d == h0Var.d && Arrays.equals(this.f11165b, h0Var.f11165b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11165b) + (this.f11164a * 31)) * 31) + this.f11166c) * 31) + this.d;
    }
}
