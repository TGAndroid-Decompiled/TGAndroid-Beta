package l5;

import java.util.Arrays;
public final class m {
    public final i5.c f15922a;
    public final byte[] f15923b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15922a = cVar;
                this.f15923b = bArr;
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
        if (!this.f15922a.equals(mVar.f15922a)) {
            return false;
        }
        return Arrays.equals(this.f15923b, mVar.f15923b);
    }

    public final int hashCode() {
        return ((this.f15922a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15923b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15922a + ", bytes=[...]}";
    }
}
