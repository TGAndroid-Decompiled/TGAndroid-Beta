package m5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f18332a;
    public final byte[] f18333b;
    public final j5.d f18334c;

    public i(String str, byte[] bArr, j5.d dVar) {
        this.f18332a = str;
        this.f18333b = bArr;
        this.f18334c = dVar;
    }

    public static k6.c a() {
        k6.c cVar = new k6.c(6, false);
        cVar.d = j5.d.f15512a;
        return cVar;
    }

    public final i b(j5.d dVar) {
        k6.c a2 = a();
        a2.H(this.f18332a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f16405b = this.f18333b;
            return a2.j();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f18332a.equals(iVar.f18332a) && Arrays.equals(this.f18333b, iVar.f18333b) && this.f18334c.equals(iVar.f18334c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18332a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18333b)) * 1000003) ^ this.f18334c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f18333b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f18332a);
        sb2.append(", ");
        sb2.append(this.f18334c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
