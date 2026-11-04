package n5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f20245a;
    public final byte[] f20246b;
    public final k5.d f20247c;

    public i(String str, byte[] bArr, k5.d dVar) {
        this.f20245a = str;
        this.f20246b = bArr;
        this.f20247c = dVar;
    }

    public static k4.j a() {
        ?? obj = new Object();
        obj.f16871c = k5.d.f16877a;
        return obj;
    }

    public final i b(k5.d dVar) {
        k4.j a10 = a();
        a10.I(this.f20245a);
        if (dVar != null) {
            a10.f16871c = dVar;
            a10.f16870b = this.f20246b;
            return a10.l();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f20245a.equals(iVar.f20245a) && Arrays.equals(this.f20246b, iVar.f20246b) && this.f20247c.equals(iVar.f20247c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20245a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20246b)) * 1000003) ^ this.f20247c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f20246b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f20245a);
        sb2.append(", ");
        sb2.append(this.f20247c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
