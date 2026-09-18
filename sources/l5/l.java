package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f14061a;
    public final byte[] f14062b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14061a = cVar;
                this.f14062b = bArr;
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
        if (!this.f14061a.equals(lVar.f14061a)) {
            return false;
        }
        return Arrays.equals(this.f14062b, lVar.f14062b);
    }

    public final int hashCode() {
        return ((this.f14061a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14062b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14061a + ", bytes=[...]}";
    }
}
