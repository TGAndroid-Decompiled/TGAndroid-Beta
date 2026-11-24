package defpackage;

import java.util.Arrays;
public final class hcb {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public hcb(j10 j10Var) {
        this.a = j10Var.a;
        this.b = j10Var.b;
        this.c = j10Var.c;
    }

    public final pef a() {
        sm2 sm2Var = new sm2((byte) 25, false);
        Boolean bool = Boolean.FALSE;
        sm2Var.b = bool;
        sm2Var.c = Boolean.valueOf(this.a);
        sm2Var.d = Boolean.valueOf(this.b);
        sm2Var.e = bool;
        sm2Var.f = Boolean.valueOf(this.c);
        return new pef(sm2Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hcb) {
                hcb hcbVar = (hcb) obj;
                if (this.a == hcbVar.a && this.b == hcbVar.b && this.c == hcbVar.c && fse.a(null, null)) {
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
