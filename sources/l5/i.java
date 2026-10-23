package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15983a;
    public final byte[] f15984b;
    public final i5.d f15985c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15983a = str;
        this.f15984b = bArr;
        this.f15985c = dVar;
    }

    public static androidx.biometric.e a() {
        androidx.biometric.e eVar = new androidx.biometric.e(28);
        eVar.d = i5.d.f12740a;
        return eVar;
    }

    public final i b(i5.d dVar) {
        androidx.biometric.e a2 = a();
        a2.u(this.f15983a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f2823c = this.f15984b;
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
            if (this.f15983a.equals(iVar.f15983a) && Arrays.equals(this.f15984b, iVar.f15984b) && this.f15985c.equals(iVar.f15985c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15983a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15984b)) * 1000003) ^ this.f15985c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15984b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15983a);
        sb2.append(", ");
        sb2.append(this.f15985c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
