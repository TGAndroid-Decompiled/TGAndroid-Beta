package defpackage;

import java.util.List;
public final class u80 extends vy2 {
    public final List a;
    public final w80 b;
    public final hy2 c;
    public final my2 d;
    public final x80 e;
    public final List f;

    public u80(List list, w80 w80Var, hy2 hy2Var, my2 my2Var, x80 x80Var, List list2) {
        this.a = list;
        this.b = w80Var;
        this.c = hy2Var;
        this.d = my2Var;
        this.e = x80Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof vy2) {
                vy2 vy2Var = (vy2) obj;
                List list = this.a;
                if (list == null) {
                    if (((u80) vy2Var).a != null) {
                        return false;
                    }
                } else if (!list.equals(((u80) vy2Var).a)) {
                    return false;
                }
                w80 w80Var = this.b;
                if (w80Var == null) {
                    if (((u80) vy2Var).b != null) {
                        return false;
                    }
                } else if (!w80Var.equals(((u80) vy2Var).b)) {
                    return false;
                }
                hy2 hy2Var = this.c;
                if (hy2Var == null) {
                    if (((u80) vy2Var).c != null) {
                        return false;
                    }
                } else if (!hy2Var.equals(((u80) vy2Var).c)) {
                    return false;
                }
                my2 my2Var = this.d;
                if (my2Var == null) {
                    if (((u80) vy2Var).d != null) {
                        return false;
                    }
                } else if (!my2Var.equals(((u80) vy2Var).d)) {
                    return false;
                }
                u80 u80Var = (u80) vy2Var;
                if (this.e.equals(u80Var.e) && this.f.equals(u80Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        List list = this.a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        w80 w80Var = this.b;
        if (w80Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = w80Var.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        hy2 hy2Var = this.c;
        if (hy2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = hy2Var.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        my2 my2Var = this.d;
        if (my2Var != null) {
            i = my2Var.hashCode();
        }
        return ((((i4 ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }
}
