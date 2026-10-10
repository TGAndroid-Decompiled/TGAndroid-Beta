package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15415a;
    public final byte[] f15416b;
    public final i5.d f15417c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15415a = str;
        this.f15416b = bArr;
        this.f15417c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f12014a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f15415a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f385c = this.f15416b;
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
            if (this.f15415a.equals(iVar.f15415a) && Arrays.equals(this.f15416b, iVar.f15416b) && this.f15417c.equals(iVar.f15417c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15415a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15416b)) * 1000003) ^ this.f15417c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15416b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15415a);
        sb2.append(", ");
        sb2.append(this.f15417c);
        sb2.append(", ");
        return a1.g.t(sb2, encodeToString, ")");
    }
}
