package defpackage;

import java.util.Arrays;
public final class deb {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public deb(k00 k00Var) {
        this.a = k00Var.a;
        this.b = k00Var.b;
        this.c = k00Var.c;
    }

    public final ehf a() {
        am2 am2Var = new am2((byte) 24, false);
        Boolean bool = Boolean.FALSE;
        am2Var.b = bool;
        am2Var.c = Boolean.valueOf(this.a);
        am2Var.d = Boolean.valueOf(this.b);
        am2Var.e = bool;
        am2Var.f = Boolean.valueOf(this.c);
        return new ehf(am2Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof deb) {
                deb debVar = (deb) obj;
                if (this.a == debVar.a && this.b == debVar.b && this.c == debVar.c && vue.a(null, null)) {
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
