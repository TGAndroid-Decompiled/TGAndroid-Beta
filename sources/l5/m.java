package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15928a;
    public final byte[] f15929b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15928a = cVar;
                this.f15929b = bArr;
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
        if (!this.f15928a.equals(mVar.f15928a)) {
            return false;
        }
        return Arrays.equals(this.f15929b, mVar.f15929b);
    }

    public final int hashCode() {
        return ((this.f15928a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15929b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15928a + ", bytes=[...]}";
    }
}
