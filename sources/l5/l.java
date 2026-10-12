package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f14587a;
    public final byte[] f14588b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14587a = cVar;
                this.f14588b = bArr;
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
        if (!this.f14587a.equals(lVar.f14587a)) {
            return false;
        }
        return Arrays.equals(this.f14588b, lVar.f14588b);
    }

    public final int hashCode() {
        return ((this.f14587a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14588b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14587a + ", bytes=[...]}";
    }
}
