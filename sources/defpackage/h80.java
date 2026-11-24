package defpackage;

import java.util.Arrays;
public final class h80 extends jy2 {
    public final String a;
    public final byte[] b;

    public h80(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof jy2) {
                jy2 jy2Var = (jy2) obj;
                h80 h80Var = (h80) jy2Var;
                if (this.a.equals(h80Var.a)) {
                    if (jy2Var instanceof h80) {
                        h80Var = (h80) jy2Var;
                    }
                    if (Arrays.equals(this.b, h80Var.b)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
