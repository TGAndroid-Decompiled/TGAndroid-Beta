package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14107a;
    public final byte[] f14108b;
    public final i5.d f14109c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14107a = str;
        this.f14108b = bArr;
        this.f14109c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f10997a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.v(this.f14107a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f357c = this.f14108b;
            return a2.h();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f14107a.equals(iVar.f14107a) && Arrays.equals(this.f14108b, iVar.f14108b) && this.f14109c.equals(iVar.f14109c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14107a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14108b)) * 1000003) ^ this.f14109c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14108b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14107a);
        sb2.append(", ");
        sb2.append(this.f14109c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
