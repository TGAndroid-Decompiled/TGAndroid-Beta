package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15414a;
    public final byte[] f15415b;
    public final i5.d f15416c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15414a = str;
        this.f15415b = bArr;
        this.f15416c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f12013a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f15414a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f385c = this.f15415b;
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
            if (this.f15414a.equals(iVar.f15414a) && Arrays.equals(this.f15415b, iVar.f15415b) && this.f15416c.equals(iVar.f15416c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15414a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15415b)) * 1000003) ^ this.f15416c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15415b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15414a);
        sb2.append(", ");
        sb2.append(this.f15416c);
        sb2.append(", ");
        return a1.g.t(sb2, encodeToString, ")");
    }
}
