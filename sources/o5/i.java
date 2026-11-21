package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f21736a;
    public final byte[] f21737b;
    public final l5.d f21738c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f21736a = str;
        this.f21737b = bArr;
        this.f21738c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(16, false);
        mVar.d = l5.d.f19700a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.I(this.f21736a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f13966c = this.f21737b;
            return a10.j();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f21736a.equals(iVar.f21736a) && Arrays.equals(this.f21737b, iVar.f21737b) && this.f21738c.equals(iVar.f21738c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21736a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21737b)) * 1000003) ^ this.f21738c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f21737b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21736a);
        sb2.append(", ");
        sb2.append(this.f21738c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
