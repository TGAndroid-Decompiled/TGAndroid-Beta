package defpackage;

import android.util.Base64;
import java.util.Arrays;
public final class ta0 {
    public final String a;
    public final byte[] b;
    public final pm8 c;

    public ta0(String str, byte[] bArr, pm8 pm8Var) {
        this.a = str;
        this.b = bArr;
        this.c = pm8Var;
    }

    public static rx6 a() {
        rx6 rx6Var = new rx6((byte) 8);
        rx6Var.d = pm8.a;
        return rx6Var;
    }

    public final ta0 b(pm8 pm8Var) {
        rx6 a = a();
        a.o0(this.a);
        if (pm8Var != null) {
            a.d = pm8Var;
            a.c = this.b;
            return a.t();
        }
        p3d.h("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ta0) {
            ta0 ta0Var = (ta0) obj;
            if (this.a.equals(ta0Var.a) && Arrays.equals(this.b, ta0Var.b) && this.c.equals(ta0Var.c)) {
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
        return c00.k(sb, encodeToString, ")");
    }
}
