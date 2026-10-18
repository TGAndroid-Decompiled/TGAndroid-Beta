package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15929a;
    public final byte[] f15930b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15929a = cVar;
                this.f15930b = bArr;
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
        if (!this.f15929a.equals(mVar.f15929a)) {
            return false;
        }
        return Arrays.equals(this.f15930b, mVar.f15930b);
    }

    public final int hashCode() {
        return ((this.f15929a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15930b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15929a + ", bytes=[...]}";
    }
}
