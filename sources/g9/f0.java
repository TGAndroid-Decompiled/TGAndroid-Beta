package g9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f7515a;
    public final byte[] f7516b;

    public f0(String str, byte[] bArr) {
        this.f7515a = str;
        this.f7516b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f7515a.equals(f0Var.f7515a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f7516b;
                } else {
                    bArr = f0Var.f7516b;
                }
                if (Arrays.equals(this.f7516b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7515a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7516b);
    }

    public final String toString() {
        return "File{filename=" + this.f7515a + ", contents=" + Arrays.toString(this.f7516b) + "}";
    }
}
