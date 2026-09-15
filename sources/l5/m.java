package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f13905a;
    public final byte[] f13906b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f13905a = cVar;
                this.f13906b = bArr;
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
        if (!this.f13905a.equals(mVar.f13905a)) {
            return false;
        }
        return Arrays.equals(this.f13906b, mVar.f13906b);
    }

    public final int hashCode() {
        return ((this.f13905a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13906b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f13905a + ", bytes=[...]}";
    }
}
