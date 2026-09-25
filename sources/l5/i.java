package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14119a;
    public final byte[] f14120b;
    public final i5.d f14121c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14119a = str;
        this.f14120b = bArr;
        this.f14121c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f10983a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f14119a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f14120b;
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
            if (this.f14119a.equals(iVar.f14119a) && Arrays.equals(this.f14120b, iVar.f14120b) && this.f14121c.equals(iVar.f14121c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14119a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14120b)) * 1000003) ^ this.f14121c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14120b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14119a);
        sb2.append(", ");
        sb2.append(this.f14121c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
