package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15914a;
    public final byte[] f15915b;
    public final i5.d f15916c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15914a = str;
        this.f15915b = bArr;
        this.f15916c = dVar;
    }

    public static androidx.biometric.e a() {
        androidx.biometric.e eVar = new androidx.biometric.e(28);
        eVar.d = i5.d.f12712a;
        return eVar;
    }

    public final i b(i5.d dVar) {
        androidx.biometric.e a2 = a();
        a2.v(this.f15914a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f2819c = this.f15915b;
            return a2.g();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f15914a.equals(iVar.f15914a) && Arrays.equals(this.f15915b, iVar.f15915b) && this.f15916c.equals(iVar.f15916c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15914a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15915b)) * 1000003) ^ this.f15916c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15915b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15914a);
        sb2.append(", ");
        sb2.append(this.f15916c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
