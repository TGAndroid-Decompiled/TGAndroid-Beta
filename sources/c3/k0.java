package c3;

import java.util.Arrays;
public final class k0 {
    public final int f4642a;
    public final byte[] f4643b;
    public final int f4644c;
    public final int d;

    public k0(int i10, int i11, int i12, byte[] bArr) {
        this.f4642a = i10;
        this.f4643b = bArr;
        this.f4644c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f4642a == k0Var.f4642a && this.f4644c == k0Var.f4644c && this.d == k0Var.d && Arrays.equals(this.f4643b, k0Var.f4643b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4643b) + (this.f4642a * 31)) * 31) + this.f4644c) * 31) + this.d;
    }
}
