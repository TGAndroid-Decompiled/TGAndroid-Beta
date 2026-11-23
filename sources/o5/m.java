package o5;

import java.util.Arrays;
public final class m {
    public final l5.c f21813a;
    public final byte[] f21814b;

    public m(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21813a = cVar;
                this.f21814b = bArr;
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
        if (!this.f21813a.equals(mVar.f21813a)) {
            return false;
        }
        return Arrays.equals(this.f21814b, mVar.f21814b);
    }

    public final int hashCode() {
        return ((this.f21813a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21814b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21813a + ", bytes=[...]}";
    }
}
