package o5;

import java.util.Arrays;
public final class l {
    public final l5.c f21719a;
    public final byte[] f21720b;

    public l(l5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21719a = cVar;
                this.f21720b = bArr;
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
        if (!this.f21719a.equals(lVar.f21719a)) {
            return false;
        }
        return Arrays.equals(this.f21720b, lVar.f21720b);
    }

    public final int hashCode() {
        return ((this.f21719a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21720b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21719a + ", bytes=[...]}";
    }
}
