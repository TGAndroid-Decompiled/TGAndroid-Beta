package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f13915a;
    public final byte[] f13916b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f13915a = cVar;
                this.f13916b = bArr;
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
        if (!this.f13915a.equals(mVar.f13915a)) {
            return false;
        }
        return Arrays.equals(this.f13916b, mVar.f13916b);
    }

    public final int hashCode() {
        return ((this.f13915a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13916b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f13915a + ", bytes=[...]}";
    }
}
