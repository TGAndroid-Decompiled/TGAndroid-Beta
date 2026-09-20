package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14093a;
    public final byte[] f14094b;
    public final i5.d f14095c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14093a = str;
        this.f14094b = bArr;
        this.f14095c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f10997a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.u(this.f14093a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f14094b;
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
            if (this.f14093a.equals(iVar.f14093a) && Arrays.equals(this.f14094b, iVar.f14094b) && this.f14095c.equals(iVar.f14095c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14093a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14094b)) * 1000003) ^ this.f14095c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14094b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14093a);
        sb2.append(", ");
        sb2.append(this.f14095c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
