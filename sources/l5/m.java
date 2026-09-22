package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f13903a;
    public final byte[] f13904b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f13903a = cVar;
                this.f13904b = bArr;
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f13903a.equals(mVar.f13903a)) {
            return false;
        }
        return Arrays.equals(this.f13904b, mVar.f13904b);
    }

    public final int hashCode() {
        return ((this.f13903a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13904b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f13903a + ", bytes=[...]}";
    }
}
