package h9;

import java.util.Arrays;

public final class f0 extends i1 {

    public final String f8686a;

    public final byte[] f8687b;

    public f0(String str, byte[] bArr) {
        this.f8686a = str;
        this.f8687b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f8686a.equals(f0Var.f8686a)) {
                if (Arrays.equals(this.f8687b, i1Var instanceof f0 ? ((f0) i1Var).f8687b : f0Var.f8687b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8686a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8687b);
    }

    public final String toString() {
        return "File{filename=" + this.f8686a + ", contents=" + Arrays.toString(this.f8687b) + "}";
    }
}
