package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f13895a;
    public final byte[] f13896b;
    public final i5.d f13897c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f13895a = str;
        this.f13896b = bArr;
        this.f13897c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f10995a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.u(this.f13895a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f13896b;
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
            if (this.f13895a.equals(iVar.f13895a) && Arrays.equals(this.f13896b, iVar.f13896b) && this.f13897c.equals(iVar.f13897c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13895a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13896b)) * 1000003) ^ this.f13897c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f13896b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f13895a);
        sb2.append(", ");
        sb2.append(this.f13897c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
