package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f13897a;
    public final byte[] f13898b;
    public final i5.d f13899c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f13897a = str;
        this.f13898b = bArr;
        this.f13899c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(26);
        aVar.d = i5.d.f10993a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.v(this.f13897a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f358c = this.f13898b;
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
            if (this.f13897a.equals(iVar.f13897a) && Arrays.equals(this.f13898b, iVar.f13898b) && this.f13899c.equals(iVar.f13899c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13897a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13898b)) * 1000003) ^ this.f13899c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f13898b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f13897a);
        sb2.append(", ");
        sb2.append(this.f13899c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
