package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f11672a;
    public final byte[] f11673b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f11672a = cVar;
                this.f11673b = bArr;
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
        if (!this.f11672a.equals(lVar.f11672a)) {
            return false;
        }
        return Arrays.equals(this.f11673b, lVar.f11673b);
    }

    public final int hashCode() {
        return ((this.f11672a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11673b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f11672a + ", bytes=[...]}";
    }
}
