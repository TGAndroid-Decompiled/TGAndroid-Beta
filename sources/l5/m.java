package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f14115a;
    public final byte[] f14116b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14115a = cVar;
                this.f14116b = bArr;
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
        if (!this.f14115a.equals(mVar.f14115a)) {
            return false;
        }
        return Arrays.equals(this.f14116b, mVar.f14116b);
    }

    public final int hashCode() {
        return ((this.f14115a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14116b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14115a + ", bytes=[...]}";
    }
}
