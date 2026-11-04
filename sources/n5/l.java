package n5;

import java.util.Arrays;
public final class l {
    public final k5.c f20253a;
    public final byte[] f20254b;

    public l(k5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f20253a = cVar;
                this.f20254b = bArr;
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
        if (!this.f20253a.equals(lVar.f20253a)) {
            return false;
        }
        return Arrays.equals(this.f20254b, lVar.f20254b);
    }

    public final int hashCode() {
        return ((this.f20253a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20254b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f20253a + ", bytes=[...]}";
    }
}
