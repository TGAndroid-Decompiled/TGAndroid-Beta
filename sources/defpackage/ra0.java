package defpackage;

import android.util.Base64;
import java.util.Arrays;
public final class ra0 {
    public final String a;
    public final byte[] b;
    public final cj8 c;

    public ra0(String str, byte[] bArr, cj8 cj8Var) {
        this.a = str;
        this.b = bArr;
        this.c = cj8Var;
    }

    public static mv6 a() {
        mv6 mv6Var = new mv6((byte) 8);
        mv6Var.d = cj8.a;
        return mv6Var;
    }

    public final ra0 b(cj8 cj8Var) {
        mv6 a = a();
        a.j0(this.a);
        if (cj8Var != null) {
            a.d = cj8Var;
            a.c = this.b;
            return a.o();
        }
        fvc.f("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ra0) {
            ra0 ra0Var = (ra0) obj;
            if (this.a.equals(ra0Var.a) && Arrays.equals(this.b, ra0Var.b) && this.c.equals(ra0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return b00.j(sb, encodeToString, ")");
    }
}
