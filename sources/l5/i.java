package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15920a;
    public final byte[] f15921b;
    public final i5.d f15922c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15920a = str;
        this.f15921b = bArr;
        this.f15922c = dVar;
    }

    public static androidx.biometric.e a() {
        androidx.biometric.e eVar = new androidx.biometric.e(28);
        eVar.d = i5.d.f12708a;
        return eVar;
    }

    public final i b(i5.d dVar) {
        androidx.biometric.e a2 = a();
        a2.v(this.f15920a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f2816c = this.f15921b;
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
            if (this.f15920a.equals(iVar.f15920a) && Arrays.equals(this.f15921b, iVar.f15921b) && this.f15922c.equals(iVar.f15922c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15920a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15921b)) * 1000003) ^ this.f15922c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15921b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15920a);
        sb2.append(", ");
        sb2.append(this.f15922c);
        sb2.append(", ");
        return a1.g.s(sb2, encodeToString, ")");
    }
}
