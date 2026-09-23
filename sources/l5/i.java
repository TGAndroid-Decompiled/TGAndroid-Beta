package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f13883a;
    public final byte[] f13884b;
    public final i5.d f13885c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f13883a = str;
        this.f13884b = bArr;
        this.f13885c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f10983a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.u(this.f13883a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f13884b;
            return a2.e();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f13883a.equals(iVar.f13883a) && Arrays.equals(this.f13884b, iVar.f13884b) && this.f13885c.equals(iVar.f13885c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13883a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13884b)) * 1000003) ^ this.f13885c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f13884b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f13883a);
        sb2.append(", ");
        sb2.append(this.f13885c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
