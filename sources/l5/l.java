package l5;

import java.util.Arrays;
public final class l {
    public final i5.c f14100a;
    public final byte[] f14101b;

    public l(i5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f14100a = cVar;
                this.f14101b = bArr;
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
        if (!this.f14100a.equals(lVar.f14100a)) {
            return false;
        }
        return Arrays.equals(this.f14101b, lVar.f14101b);
    }

    public final int hashCode() {
        return ((this.f14100a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14101b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14100a + ", bytes=[...]}";
    }
}
