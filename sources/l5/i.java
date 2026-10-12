package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15159a;
    public final byte[] f15160b;
    public final i5.d f15161c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15159a = str;
        this.f15160b = bArr;
        this.f15161c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f12012a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f15159a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f387c = this.f15160b;
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
            if (this.f15159a.equals(iVar.f15159a) && Arrays.equals(this.f15160b, iVar.f15160b) && this.f15161c.equals(iVar.f15161c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15159a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15160b)) * 1000003) ^ this.f15161c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15160b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15159a);
        sb2.append(", ");
        sb2.append(this.f15161c);
        sb2.append(", ");
        return a1.g.t(sb2, encodeToString, ")");
    }
}
