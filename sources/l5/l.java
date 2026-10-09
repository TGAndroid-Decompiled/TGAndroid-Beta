package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f15419a;
    public final byte[] f15420b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f15419a = cVar;
                this.f15420b = bArr;
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
        if (!this.f15419a.equals(lVar.f15419a)) {
            return false;
        }
        return Arrays.equals(this.f15420b, lVar.f15420b);
    }

    public final int hashCode() {
        return ((this.f15419a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15420b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15419a + ", bytes=[...]}";
    }
}
