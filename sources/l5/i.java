package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15283a;
    public final byte[] f15284b;
    public final i5.d f15285c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15283a = str;
        this.f15284b = bArr;
        this.f15285c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(26);
        aVar.d = i5.d.f11859a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.B(this.f15283a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f372c = this.f15284b;
            return a2.f();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f15283a.equals(iVar.f15283a) && Arrays.equals(this.f15284b, iVar.f15284b) && this.f15285c.equals(iVar.f15285c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15283a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15284b)) * 1000003) ^ this.f15285c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15284b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15283a);
        sb2.append(", ");
        sb2.append(this.f15285c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
