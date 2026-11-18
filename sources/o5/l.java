package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f21722a;
    public final byte[] f21723b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21722a = cVar;
                this.f21723b = bArr;
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
        if (!this.f21722a.equals(lVar.f21722a)) {
            return false;
        }
        return Arrays.equals(this.f21723b, lVar.f21723b);
    }

    public final int hashCode() {
        return ((this.f21722a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21723b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21722a + ", bytes=[...]}";
    }
}
