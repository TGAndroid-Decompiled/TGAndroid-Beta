package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15927a;
    public final byte[] f15928b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15927a = cVar;
                this.f15928b = bArr;
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
        if (!this.f15927a.equals(mVar.f15927a)) {
            return false;
        }
        return Arrays.equals(this.f15928b, mVar.f15928b);
    }

    public final int hashCode() {
        return ((this.f15927a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15928b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15927a + ", bytes=[...]}";
    }
}
