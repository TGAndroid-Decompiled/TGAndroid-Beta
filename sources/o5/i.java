package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f20831a;
    public final byte[] f20832b;
    public final l5.d f20833c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f20831a = str;
        this.f20832b = bArr;
        this.f20833c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(16, false);
        mVar.d = l5.d.f18178a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.F(this.f20831a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f14267c = this.f20832b;
            return a10.h();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f20831a.equals(iVar.f20831a) && Arrays.equals(this.f20832b, iVar.f20832b) && this.f20833c.equals(iVar.f20833c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20831a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20832b)) * 1000003) ^ this.f20833c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f20832b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f20831a);
        sb2.append(", ");
        sb2.append(this.f20833c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
