package da;

import java.util.List;
public final class w0 extends i2 {
    public final List f7940a;
    public final e2 f7941b;
    public final u1 f7942c;
    public final z1 d;
    public final z0 f7943e;
    public final List f7944f;

    public w0(List list, e2 e2Var, u1 u1Var, z1 z1Var, z0 z0Var, List list2) {
        this.f7940a = list;
        this.f7941b = e2Var;
        this.f7942c = u1Var;
        this.d = z1Var;
        this.f7943e = z0Var;
        this.f7944f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i2) {
                i2 i2Var = (i2) obj;
                List list = this.f7940a;
                if (list == null) {
                    if (((w0) i2Var).f7940a != null) {
                        return false;
                    }
                } else if (!list.equals(((w0) i2Var).f7940a)) {
                    return false;
                }
                e2 e2Var = this.f7941b;
                if (e2Var == null) {
                    if (((w0) i2Var).f7941b != null) {
                        return false;
                    }
                } else if (!e2Var.equals(((w0) i2Var).f7941b)) {
                    return false;
                }
                u1 u1Var = this.f7942c;
                if (u1Var == null) {
                    if (((w0) i2Var).f7942c != null) {
                        return false;
                    }
                } else if (!u1Var.equals(((w0) i2Var).f7942c)) {
                    return false;
                }
                z1 z1Var = this.d;
                if (z1Var == null) {
                    if (((w0) i2Var).d != null) {
                        return false;
                    }
                } else if (!z1Var.equals(((w0) i2Var).d)) {
                    return false;
                }
                w0 w0Var = (w0) i2Var;
                if (this.f7943e.equals(w0Var.f7943e) && this.f7944f.equals(w0Var.f7944f)) {
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
        int i7 = 0;
        List list = this.f7940a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        e2 e2Var = this.f7941b;
        if (e2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = e2Var.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        u1 u1Var = this.f7942c;
        if (u1Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = u1Var.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        z1 z1Var = this.d;
        if (z1Var != null) {
            i7 = z1Var.hashCode();
        }
        return ((((i7 ^ i12) * 1000003) ^ this.f7943e.hashCode()) * 1000003) ^ this.f7944f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f7940a + ", exception=" + this.f7941b + ", appExitInfo=" + this.f7942c + ", profilingManagerInfo=" + this.d + ", signal=" + this.f7943e + ", binaries=" + this.f7944f + "}";
    }
}
