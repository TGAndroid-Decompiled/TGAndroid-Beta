package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f14127a;
    public final byte[] f14128b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14127a = cVar;
                this.f14128b = bArr;
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
        if (!this.f14127a.equals(lVar.f14127a)) {
            return false;
        }
        return Arrays.equals(this.f14128b, lVar.f14128b);
    }

    public final int hashCode() {
        return ((this.f14127a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14128b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14127a + ", bytes=[...]}";
    }
}
