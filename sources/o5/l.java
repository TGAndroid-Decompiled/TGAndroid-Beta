package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f21713a;
    public final byte[] f21714b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21713a = cVar;
                this.f21714b = bArr;
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
        if (!this.f21713a.equals(lVar.f21713a)) {
            return false;
        }
        return Arrays.equals(this.f21714b, lVar.f21714b);
    }

    public final int hashCode() {
        return ((this.f21713a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21714b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21713a + ", bytes=[...]}";
    }
}
