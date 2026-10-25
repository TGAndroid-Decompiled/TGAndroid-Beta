package m5;

import java.util.Arrays;
public final class m {
    public final j5.c f18341a;
    public final byte[] f18342b;

    public m(j5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f18341a = cVar;
                this.f18342b = bArr;
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
        if (!this.f18341a.equals(mVar.f18341a)) {
            return false;
        }
        return Arrays.equals(this.f18342b, mVar.f18342b);
    }

    public final int hashCode() {
        return ((this.f18341a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18342b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f18341a + ", bytes=[...]}";
    }
}
