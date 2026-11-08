package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f20834a;
    public final byte[] f20835b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f20834a = cVar;
                this.f20835b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f20834a.equals(lVar.f20834a)) {
            return false;
        }
        return Arrays.equals(this.f20835b, lVar.f20835b);
    }

    public final int hashCode() {
        return ((this.f20834a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20835b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f20834a + ", bytes=[...]}";
    }
}
