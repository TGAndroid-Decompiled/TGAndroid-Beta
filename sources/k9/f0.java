package k9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f10108a;
    public final byte[] f10109b;

    public f0(String str, byte[] bArr) {
        this.f10108a = str;
        this.f10109b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f10108a.equals(f0Var.f10108a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f10109b;
                } else {
                    bArr = f0Var.f10109b;
                }
                if (Arrays.equals(this.f10109b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10108a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10109b);
    }

    public final String toString() {
        return "File{filename=" + this.f10108a + ", contents=" + Arrays.toString(this.f10109b) + "}";
    }
}
