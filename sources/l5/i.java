package l5;

import android.support.v4.media.session.a0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f11665a;
    public final byte[] f11666b;
    public final i5.d f11667c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f11665a = str;
        this.f11666b = bArr;
        this.f11667c = dVar;
    }

    public static a0 a() {
        a0 a0Var = new a0(28);
        a0Var.d = i5.d.f8207a;
        return a0Var;
    }

    public final i b(i5.d dVar) {
        a0 a2 = a();
        a2.y(this.f11665a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f876c = this.f11666b;
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
            if (this.f11665a.equals(iVar.f11665a) && Arrays.equals(this.f11666b, iVar.f11666b) && this.f11667c.equals(iVar.f11667c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11665a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11666b)) * 1000003) ^ this.f11667c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f11666b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f11665a);
        sb2.append(", ");
        sb2.append(this.f11667c);
        sb2.append(", ");
        return a1.g.r(sb2, encodeToString, ")");
    }
}
