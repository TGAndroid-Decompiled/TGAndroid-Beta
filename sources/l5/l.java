package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f11671a;
    public final byte[] f11672b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f11671a = cVar;
                this.f11672b = bArr;
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
        if (!this.f11671a.equals(lVar.f11671a)) {
            return false;
        }
        return Arrays.equals(this.f11672b, lVar.f11672b);
    }

    public final int hashCode() {
        return ((this.f11671a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11672b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f11671a + ", bytes=[...]}";
    }
}
