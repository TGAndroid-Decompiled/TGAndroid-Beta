package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f15422a;
    public final byte[] f15423b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15422a = cVar;
                this.f15423b = bArr;
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f15422a.equals(lVar.f15422a)) {
            return false;
        }
        return Arrays.equals(this.f15423b, lVar.f15423b);
    }

    public final int hashCode() {
        return ((this.f15422a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15423b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15422a + ", bytes=[...]}";
    }
}
