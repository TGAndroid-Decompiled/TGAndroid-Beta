package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15347a;
    public final byte[] f15348b;
    public final i5.d f15349c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15347a = str;
        this.f15348b = bArr;
        this.f15349c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f11964a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.s(this.f15347a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f387c = this.f15348b;
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
            if (this.f15347a.equals(iVar.f15347a) && Arrays.equals(this.f15348b, iVar.f15348b) && this.f15349c.equals(iVar.f15349c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15347a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15348b)) * 1000003) ^ this.f15349c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15348b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15347a);
        sb2.append(", ");
        sb2.append(this.f15349c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
