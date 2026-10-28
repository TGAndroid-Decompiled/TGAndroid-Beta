package m5;

import java.util.Arrays;
public final class m {
    public final j5.c f18340a;
    public final byte[] f18341b;

    public m(j5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f18340a = cVar;
                this.f18341b = bArr;
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
        if (!this.f18340a.equals(mVar.f18340a)) {
            return false;
        }
        return Arrays.equals(this.f18341b, mVar.f18341b);
    }

    public final int hashCode() {
        return ((this.f18340a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18341b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f18340a + ", bytes=[...]}";
    }
}
