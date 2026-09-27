package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14121a;
    public final byte[] f14122b;
    public final i5.d f14123c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14121a = str;
        this.f14122b = bArr;
        this.f14123c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f10986a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f14121a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f14122b;
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
            if (this.f14121a.equals(iVar.f14121a) && Arrays.equals(this.f14122b, iVar.f14122b) && this.f14123c.equals(iVar.f14123c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14121a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14122b)) * 1000003) ^ this.f14123c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14122b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14121a);
        sb2.append(", ");
        sb2.append(this.f14123c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
