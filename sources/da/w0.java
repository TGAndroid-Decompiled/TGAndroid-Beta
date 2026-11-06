package da;

import java.util.List;
public final class w0 extends i2 {
    public final List f8550a;
    public final e2 f8551b;
    public final u1 f8552c;
    public final z1 d;
    public final z0 f8553e;
    public final List f8554f;

    public w0(List list, e2 e2Var, u1 u1Var, z1 z1Var, z0 z0Var, List list2) {
        this.f8550a = list;
        this.f8551b = e2Var;
        this.f8552c = u1Var;
        this.d = z1Var;
        this.f8553e = z0Var;
        this.f8554f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i2) {
                i2 i2Var = (i2) obj;
                List list = this.f8550a;
                if (list == null) {
                    if (((w0) i2Var).f8550a != null) {
                        return false;
                    }
                } else if (!list.equals(((w0) i2Var).f8550a)) {
                    return false;
                }
                e2 e2Var = this.f8551b;
                if (e2Var == null) {
                    if (((w0) i2Var).f8551b != null) {
                        return false;
                    }
                } else if (!e2Var.equals(((w0) i2Var).f8551b)) {
                    return false;
                }
                u1 u1Var = this.f8552c;
                if (u1Var == null) {
                    if (((w0) i2Var).f8552c != null) {
                        return false;
                    }
                } else if (!u1Var.equals(((w0) i2Var).f8552c)) {
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
                if (this.f8553e.equals(w0Var.f8553e) && this.f8554f.equals(w0Var.f8554f)) {
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
        List list = this.f8550a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        e2 e2Var = this.f8551b;
        if (e2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = e2Var.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        u1 u1Var = this.f8552c;
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
        return ((((i7 ^ i12) * 1000003) ^ this.f8553e.hashCode()) * 1000003) ^ this.f8554f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f8550a + ", exception=" + this.f8551b + ", appExitInfo=" + this.f8552c + ", profilingManagerInfo=" + this.d + ", signal=" + this.f8553e + ", binaries=" + this.f8554f + "}";
    }
}
