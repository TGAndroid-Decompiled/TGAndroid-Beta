package c3;

import java.util.Arrays;
public final class h0 {
    public final int f4253a;
    public final byte[] f4254b;
    public final int f4255c;
    public final int d;

    public h0(int i10, int i11, int i12, byte[] bArr) {
        this.f4253a = i10;
        this.f4254b = bArr;
        this.f4255c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f4253a == h0Var.f4253a && this.f4255c == h0Var.f4255c && this.d == h0Var.d && Arrays.equals(this.f4254b, h0Var.f4254b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4254b) + (this.f4253a * 31)) * 31) + this.f4255c) * 31) + this.d;
    }
}
