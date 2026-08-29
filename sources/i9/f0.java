package i9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f8650a;
    public final byte[] f8651b;

    public f0(String str, byte[] bArr) {
        this.f8650a = str;
        this.f8651b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f8650a.equals(f0Var.f8650a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f8651b;
                } else {
                    bArr = f0Var.f8651b;
                }
                if (Arrays.equals(this.f8651b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8650a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8651b);
    }

    public final String toString() {
        return "File{filename=" + this.f8650a + ", contents=" + Arrays.toString(this.f8651b) + "}";
    }
}
