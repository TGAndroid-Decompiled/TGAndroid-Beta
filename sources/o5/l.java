package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f21744a;
    public final byte[] f21745b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21744a = cVar;
                this.f21745b = bArr;
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
        if (!this.f21744a.equals(lVar.f21744a)) {
            return false;
        }
        return Arrays.equals(this.f21745b, lVar.f21745b);
    }

    public final int hashCode() {
        return ((this.f21744a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21745b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21744a + ", bytes=[...]}";
    }
}
