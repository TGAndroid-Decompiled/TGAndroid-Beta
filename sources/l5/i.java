package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15346a;
    public final byte[] f15347b;
    public final i5.d f15348c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15346a = str;
        this.f15347b = bArr;
        this.f15348c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f11963a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.s(this.f15346a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f387c = this.f15347b;
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
            if (this.f15346a.equals(iVar.f15346a) && Arrays.equals(this.f15347b, iVar.f15347b) && this.f15348c.equals(iVar.f15348c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15346a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15347b)) * 1000003) ^ this.f15348c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15347b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15346a);
        sb2.append(", ");
        sb2.append(this.f15348c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
