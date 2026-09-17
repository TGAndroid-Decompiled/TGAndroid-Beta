package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f15310a;
    public final byte[] f15311b;
    public final i5.d f15312c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f15310a = str;
        this.f15311b = bArr;
        this.f15312c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(26);
        aVar.d = i5.d.f11885a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.B(this.f15310a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f384c = this.f15311b;
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
            if (this.f15310a.equals(iVar.f15310a) && Arrays.equals(this.f15311b, iVar.f15311b) && this.f15312c.equals(iVar.f15312c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15310a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15311b)) * 1000003) ^ this.f15312c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f15311b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f15310a);
        sb2.append(", ");
        sb2.append(this.f15312c);
        sb2.append(", ");
        return a4.a.s(sb2, encodeToString, ")");
    }
}
