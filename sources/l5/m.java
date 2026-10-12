package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15168a;
    public final byte[] f15169b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15168a = cVar;
                this.f15169b = bArr;
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
        if (!this.f15168a.equals(mVar.f15168a)) {
            return false;
        }
        return Arrays.equals(this.f15169b, mVar.f15169b);
    }

    public final int hashCode() {
        return ((this.f15168a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15169b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15168a + ", bytes=[...]}";
    }
}
