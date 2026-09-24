package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f14111a;
    public final byte[] f14112b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14111a = cVar;
                this.f14112b = bArr;
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
        if (!this.f14111a.equals(lVar.f14111a)) {
            return false;
        }
        return Arrays.equals(this.f14112b, lVar.f14112b);
    }

    public final int hashCode() {
        return ((this.f14111a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14112b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14111a + ", bytes=[...]}";
    }
}
