package defpackage;

import java.util.Arrays;
public final class z34 {
    public final d44 a;
    public final byte[] b;

    public z34(d44 d44Var, byte[] bArr) {
        if (d44Var != null) {
            if (bArr != null) {
                this.a = d44Var;
                this.b = bArr;
                return;
            }
            gxc.d("bytes is null");
            throw null;
        }
        gxc.d("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z34)) {
            return false;
        }
        z34 z34Var = (z34) obj;
        if (!this.a.equals(z34Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, z34Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
