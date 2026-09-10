package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f12793a;
    public final byte[] f12794b;
    public final i5.d f12795c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f12793a = str;
        this.f12794b = bArr;
        this.f12795c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(26);
        aVar.d = i5.d.f10477a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.w(this.f12793a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f356c = this.f12794b;
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
            if (this.f12793a.equals(iVar.f12793a) && Arrays.equals(this.f12794b, iVar.f12794b) && this.f12795c.equals(iVar.f12795c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12793a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12794b)) * 1000003) ^ this.f12795c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f12794b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f12793a);
        sb2.append(", ");
        sb2.append(this.f12795c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
