package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f13907a;
    public final byte[] f13908b;
    public final i5.d f13909c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f13907a = str;
        this.f13908b = bArr;
        this.f13909c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(27);
        aVar.d = i5.d.f10996a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.u(this.f13907a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f13908b;
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
            if (this.f13907a.equals(iVar.f13907a) && Arrays.equals(this.f13908b, iVar.f13908b) && this.f13909c.equals(iVar.f13909c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13907a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13908b)) * 1000003) ^ this.f13909c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f13908b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f13907a);
        sb2.append(", ");
        sb2.append(this.f13909c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
