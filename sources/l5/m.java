package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15169a;
    public final byte[] f15170b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15169a = cVar;
                this.f15170b = bArr;
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
        if (!this.f15169a.equals(mVar.f15169a)) {
            return false;
        }
        return Arrays.equals(this.f15170b, mVar.f15170b);
    }

    public final int hashCode() {
        return ((this.f15169a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15170b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15169a + ", bytes=[...]}";
    }
}
