package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15411a;
    public final byte[] f15412b;
    public final i5.d f15413c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15411a = str;
        this.f15412b = bArr;
        this.f15413c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f12014a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f15411a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f385c = this.f15412b;
            return a2.d();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f15411a.equals(iVar.f15411a) && Arrays.equals(this.f15412b, iVar.f15412b) && this.f15413c.equals(iVar.f15413c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15411a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15412b)) * 1000003) ^ this.f15413c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15412b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15411a);
        sb2.append(", ");
        sb2.append(this.f15413c);
        sb2.append(", ");
        return a1.g.t(sb2, encodeToString, ")");
    }
}
