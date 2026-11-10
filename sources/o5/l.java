package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f20839a;
    public final byte[] f20840b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f20839a = cVar;
                this.f20840b = bArr;
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
        if (!this.f20839a.equals(lVar.f20839a)) {
            return false;
        }
        return Arrays.equals(this.f20840b, lVar.f20840b);
    }

    public final int hashCode() {
        return ((this.f20839a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20840b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f20839a + ", bytes=[...]}";
    }
}
