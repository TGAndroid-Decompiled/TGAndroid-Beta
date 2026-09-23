package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f13891a;
    public final byte[] f13892b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f13891a = cVar;
                this.f13892b = bArr;
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
        if (!this.f13891a.equals(mVar.f13891a)) {
            return false;
        }
        return Arrays.equals(this.f13892b, mVar.f13892b);
    }

    public final int hashCode() {
        return ((this.f13891a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13892b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f13891a + ", bytes=[...]}";
    }
}
