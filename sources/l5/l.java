package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f15318a;
    public final byte[] f15319b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15318a = cVar;
                this.f15319b = bArr;
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
        if (!this.f15318a.equals(lVar.f15318a)) {
            return false;
        }
        return Arrays.equals(this.f15319b, lVar.f15319b);
    }

    public final int hashCode() {
        return ((this.f15318a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15319b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15318a + ", bytes=[...]}";
    }
}
