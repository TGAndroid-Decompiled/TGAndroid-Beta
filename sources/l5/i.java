package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15921a;
    public final byte[] f15922b;
    public final i5.d f15923c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15921a = str;
        this.f15922b = bArr;
        this.f15923c = dVar;
    }

    public static androidx.biometric.e a() {
        androidx.biometric.e eVar = new androidx.biometric.e(28);
        eVar.d = i5.d.f12710a;
        return eVar;
    }

    public final i b(i5.d dVar) {
        androidx.biometric.e a2 = a();
        a2.v(this.f15921a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f2820c = this.f15922b;
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
            if (this.f15921a.equals(iVar.f15921a) && Arrays.equals(this.f15922b, iVar.f15922b) && this.f15923c.equals(iVar.f15923c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15921a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15922b)) * 1000003) ^ this.f15923c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15922b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15921a);
        sb2.append(", ");
        sb2.append(this.f15923c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
