package m5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f18333a;
    public final byte[] f18334b;
    public final j5.d f18335c;

    public i(String str, byte[] bArr, j5.d dVar) {
        this.f18333a = str;
        this.f18334b = bArr;
        this.f18335c = dVar;
    }

    public static k6.c a() {
        k6.c cVar = new k6.c(6, false);
        cVar.d = j5.d.f15513a;
        return cVar;
    }

    public final i b(j5.d dVar) {
        k6.c a2 = a();
        a2.H(this.f18333a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f16406b = this.f18334b;
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
            if (this.f18333a.equals(iVar.f18333a) && Arrays.equals(this.f18334b, iVar.f18334b) && this.f18335c.equals(iVar.f18335c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18333a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18334b)) * 1000003) ^ this.f18335c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f18334b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f18333a);
        sb2.append(", ");
        sb2.append(this.f18335c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
