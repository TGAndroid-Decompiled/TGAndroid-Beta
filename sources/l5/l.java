package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f12800a;
    public final byte[] f12801b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f12800a = cVar;
                this.f12801b = bArr;
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
        if (!this.f12800a.equals(lVar.f12800a)) {
            return false;
        }
        return Arrays.equals(this.f12801b, lVar.f12801b);
    }

    public final int hashCode() {
        return ((this.f12800a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12801b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f12800a + ", bytes=[...]}";
    }
}
