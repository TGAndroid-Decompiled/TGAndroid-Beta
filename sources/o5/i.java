package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f21347a;
    public final byte[] f21348b;
    public final l5.d f21349c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f21347a = str;
        this.f21348b = bArr;
        this.f21349c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(16, false);
        mVar.d = l5.d.f19308a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.F(this.f21347a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f13625c = this.f21348b;
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
            if (this.f21347a.equals(iVar.f21347a) && Arrays.equals(this.f21348b, iVar.f21348b) && this.f21349c.equals(iVar.f21349c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21347a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21348b)) * 1000003) ^ this.f21349c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f21348b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21347a);
        sb2.append(", ");
        sb2.append(this.f21349c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
