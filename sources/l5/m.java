package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15991a;
    public final byte[] f15992b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15991a = cVar;
                this.f15992b = bArr;
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
        if (!this.f15991a.equals(mVar.f15991a)) {
            return false;
        }
        return Arrays.equals(this.f15992b, mVar.f15992b);
    }

    public final int hashCode() {
        return ((this.f15991a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15992b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15991a + ", bytes=[...]}";
    }
}
