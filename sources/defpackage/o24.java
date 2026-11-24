package defpackage;

import java.util.Arrays;
public final class o24 {
    public final s24 a;
    public final byte[] b;

    public o24(s24 s24Var, byte[] bArr) {
        if (s24Var != null) {
            if (bArr != null) {
                this.a = s24Var;
                this.b = bArr;
                return;
            }
            fvc.f("bytes is null");
            throw null;
        }
        fvc.f("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o24)) {
            return false;
        }
        o24 o24Var = (o24) obj;
        if (!this.a.equals(o24Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, o24Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
