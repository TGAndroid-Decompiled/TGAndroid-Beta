package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f15423a;
    public final byte[] f15424b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15423a = cVar;
                this.f15424b = bArr;
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
        if (!this.f15423a.equals(lVar.f15423a)) {
            return false;
        }
        return Arrays.equals(this.f15424b, lVar.f15424b);
    }

    public final int hashCode() {
        return ((this.f15423a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15424b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15423a + ", bytes=[...]}";
    }
}
