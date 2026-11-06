package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f20831a;
    public final byte[] f20832b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f20831a = cVar;
                this.f20832b = bArr;
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
        if (!this.f20831a.equals(lVar.f20831a)) {
            return false;
        }
        return Arrays.equals(this.f20832b, lVar.f20832b);
    }

    public final int hashCode() {
        return ((this.f20831a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20832b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f20831a + ", bytes=[...]}";
    }
}
