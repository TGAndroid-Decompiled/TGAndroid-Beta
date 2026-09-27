package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f14128a;
    public final byte[] f14129b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14128a = cVar;
                this.f14129b = bArr;
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
        if (!this.f14128a.equals(lVar.f14128a)) {
            return false;
        }
        return Arrays.equals(this.f14129b, lVar.f14129b);
    }

    public final int hashCode() {
        return ((this.f14128a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14129b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14128a + ", bytes=[...]}";
    }
}
