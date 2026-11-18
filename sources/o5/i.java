package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f21714a;
    public final byte[] f21715b;
    public final l5.d f21716c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f21714a = str;
        this.f21715b = bArr;
        this.f21716c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(16, false);
        mVar.d = l5.d.f19675a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.I(this.f21714a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f13940c = this.f21715b;
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
            if (this.f21714a.equals(iVar.f21714a) && Arrays.equals(this.f21715b, iVar.f21715b) && this.f21716c.equals(iVar.f21716c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21714a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21715b)) * 1000003) ^ this.f21716c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f21715b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21714a);
        sb2.append(", ");
        sb2.append(this.f21716c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
