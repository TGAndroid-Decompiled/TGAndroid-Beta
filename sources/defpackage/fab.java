package defpackage;

import java.util.Arrays;
public final class fab {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public fab(j00 j00Var) {
        this.a = j00Var.a;
        this.b = j00Var.b;
        this.c = j00Var.c;
    }

    public final ocf a() {
        gl2 gl2Var = new gl2((byte) 24, false);
        Boolean bool = Boolean.FALSE;
        gl2Var.b = bool;
        gl2Var.c = Boolean.valueOf(this.a);
        gl2Var.d = Boolean.valueOf(this.b);
        gl2Var.e = bool;
        gl2Var.f = Boolean.valueOf(this.c);
        return new ocf(gl2Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof fab) {
                fab fabVar = (fab) obj;
                if (this.a == fabVar.a && this.b == fabVar.b && this.c == fabVar.c && cqe.a(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        Boolean valueOf3 = Boolean.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
