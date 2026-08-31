package k9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f10870a;
    public final byte[] f10871b;

    public f0(String str, byte[] bArr) {
        this.f10870a = str;
        this.f10871b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f10870a.equals(f0Var.f10870a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f10871b;
                } else {
                    bArr = f0Var.f10871b;
                }
                if (Arrays.equals(this.f10871b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10870a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10871b);
    }

    public final String toString() {
        return "File{filename=" + this.f10870a + ", contents=" + Arrays.toString(this.f10871b) + "}";
    }
}
