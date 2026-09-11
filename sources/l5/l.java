package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f15291a;
    public final byte[] f15292b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15291a = cVar;
                this.f15292b = bArr;
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
        if (!this.f15291a.equals(lVar.f15291a)) {
            return false;
        }
        return Arrays.equals(this.f15292b, lVar.f15292b);
    }

    public final int hashCode() {
        return ((this.f15291a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15292b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15291a + ", bytes=[...]}";
    }
}
