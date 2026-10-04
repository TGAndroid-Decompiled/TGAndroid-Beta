package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15356a;
    public final byte[] f15357b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15356a = cVar;
                this.f15357b = bArr;
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
        if (!this.f15356a.equals(mVar.f15356a)) {
            return false;
        }
        return Arrays.equals(this.f15357b, mVar.f15357b);
    }

    public final int hashCode() {
        return ((this.f15356a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15357b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15356a + ", bytes=[...]}";
    }
}
