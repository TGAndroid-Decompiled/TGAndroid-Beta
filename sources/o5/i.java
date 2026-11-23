package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f21804a;
    public final byte[] f21805b;
    public final l5.d f21806c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f21804a = str;
        this.f21805b = bArr;
        this.f21806c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(17);
        mVar.d = l5.d.f19769a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.I(this.f21804a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f13932c = this.f21805b;
            return a10.u();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f21804a.equals(iVar.f21804a) && Arrays.equals(this.f21805b, iVar.f21805b) && this.f21806c.equals(iVar.f21806c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21804a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21805b)) * 1000003) ^ this.f21806c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f21805b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21804a);
        sb2.append(", ");
        sb2.append(this.f21806c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
