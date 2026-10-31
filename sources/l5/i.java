package l5;

import android.support.v4.media.session.a0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f11664a;
    public final byte[] f11665b;
    public final i5.d f11666c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f11664a = str;
        this.f11665b = bArr;
        this.f11666c = dVar;
    }

    public static a0 a() {
        a0 a0Var = new a0(28);
        a0Var.d = i5.d.f8206a;
        return a0Var;
    }

    public final i b(i5.d dVar) {
        a0 a2 = a();
        a2.y(this.f11664a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f876c = this.f11665b;
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
            if (this.f11664a.equals(iVar.f11664a) && Arrays.equals(this.f11665b, iVar.f11665b) && this.f11666c.equals(iVar.f11666c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11664a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11665b)) * 1000003) ^ this.f11666c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f11665b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f11664a);
        sb2.append(", ");
        sb2.append(this.f11666c);
        sb2.append(", ");
        return a1.g.r(sb2, encodeToString, ")");
    }
}
