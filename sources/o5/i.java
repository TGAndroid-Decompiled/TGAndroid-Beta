package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f21711a;
    public final byte[] f21712b;
    public final l5.d f21713c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f21711a = str;
        this.f21712b = bArr;
        this.f21713c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(16, false);
        mVar.d = l5.d.f19672a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.I(this.f21711a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f13937c = this.f21712b;
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
            if (this.f21711a.equals(iVar.f21711a) && Arrays.equals(this.f21712b, iVar.f21712b) && this.f21713c.equals(iVar.f21713c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21711a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21712b)) * 1000003) ^ this.f21713c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f21712b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21711a);
        sb2.append(", ");
        sb2.append(this.f21713c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
