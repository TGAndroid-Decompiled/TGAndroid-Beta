package defpackage;

import java.util.Arrays;
public final class j34 {
    public final n34 a;
    public final byte[] b;

    public j34(n34 n34Var, byte[] bArr) {
        if (n34Var != null) {
            if (bArr != null) {
                this.a = n34Var;
                this.b = bArr;
                return;
            }
            p3d.h("bytes is null");
            throw null;
        }
        p3d.h("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j34)) {
            return false;
        }
        j34 j34Var = (j34) obj;
        if (!this.a.equals(j34Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, j34Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
