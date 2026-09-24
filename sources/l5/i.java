package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14104a;
    public final byte[] f14105b;
    public final i5.d f14106c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14104a = str;
        this.f14105b = bArr;
        this.f14106c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f10983a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f14104a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f14105b;
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
            if (this.f14104a.equals(iVar.f14104a) && Arrays.equals(this.f14105b, iVar.f14105b) && this.f14106c.equals(iVar.f14106c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14104a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14105b)) * 1000003) ^ this.f14106c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14105b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14104a);
        sb2.append(", ");
        sb2.append(this.f14106c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
