package k9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f10128a;
    public final byte[] f10129b;

    public f0(String str, byte[] bArr) {
        this.f10128a = str;
        this.f10129b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f10128a.equals(f0Var.f10128a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f10129b;
                } else {
                    bArr = f0Var.f10129b;
                }
                if (Arrays.equals(this.f10129b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10128a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10129b);
    }

    public final String toString() {
        return "File{filename=" + this.f10128a + ", contents=" + Arrays.toString(this.f10129b) + "}";
    }
}
