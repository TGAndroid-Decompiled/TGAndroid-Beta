package defpackage;

import android.util.Base64;
import java.util.Arrays;
public final class rb0 {
    public final String a;
    public final byte[] b;
    public final fl8 c;

    public rb0(String str, byte[] bArr, fl8 fl8Var) {
        this.a = str;
        this.b = bArr;
        this.c = fl8Var;
    }

    public static mx6 a() {
        mx6 mx6Var = new mx6((byte) 8);
        mx6Var.d = fl8.a;
        return mx6Var;
    }

    public final rb0 b(fl8 fl8Var) {
        mx6 a = a();
        a.m0(this.a);
        if (fl8Var != null) {
            a.d = fl8Var;
            a.c = this.b;
            return a.u();
        }
        gxc.d("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rb0) {
            rb0 rb0Var = (rb0) obj;
            if (this.a.equals(rb0Var.a) && Arrays.equals(this.b, rb0Var.b) && this.c.equals(rb0Var.c)) {
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
        return b10.j(sb, encodeToString, ")");
    }
}
