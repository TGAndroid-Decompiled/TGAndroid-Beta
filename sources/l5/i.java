package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15160a;
    public final byte[] f15161b;
    public final i5.d f15162c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15160a = str;
        this.f15161b = bArr;
        this.f15162c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f12012a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f15160a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f387c = this.f15161b;
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
            if (this.f15160a.equals(iVar.f15160a) && Arrays.equals(this.f15161b, iVar.f15161b) && this.f15162c.equals(iVar.f15162c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15160a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15161b)) * 1000003) ^ this.f15162c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15161b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15160a);
        sb2.append(", ");
        sb2.append(this.f15162c);
        sb2.append(", ");
        return a1.g.t(sb2, encodeToString, ")");
    }
}
