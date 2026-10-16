package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14580a;
    public final byte[] f14581b;
    public final i5.d f14582c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14580a = str;
        this.f14581b = bArr;
        this.f14582c = dVar;
    }

    public static androidx.biometric.e a() {
        androidx.biometric.e eVar = new androidx.biometric.e(28);
        eVar.d = i5.d.f11323a;
        return eVar;
    }

    public final i b(i5.d dVar) {
        androidx.biometric.e a2 = a();
        a2.v(this.f14580a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f1201c = this.f14581b;
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
            if (this.f14580a.equals(iVar.f14580a) && Arrays.equals(this.f14581b, iVar.f14581b) && this.f14582c.equals(iVar.f14582c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14580a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14581b)) * 1000003) ^ this.f14582c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14581b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14580a);
        sb2.append(", ");
        sb2.append(this.f14582c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
