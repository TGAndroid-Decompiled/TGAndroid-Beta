package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15345a;
    public final byte[] f15346b;
    public final i5.d f15347c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15345a = str;
        this.f15346b = bArr;
        this.f15347c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f11963a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.s(this.f15345a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f387c = this.f15346b;
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
            if (this.f15345a.equals(iVar.f15345a) && Arrays.equals(this.f15346b, iVar.f15346b) && this.f15347c.equals(iVar.f15347c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15345a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15346b)) * 1000003) ^ this.f15347c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15346b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15345a);
        sb2.append(", ");
        sb2.append(this.f15347c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
