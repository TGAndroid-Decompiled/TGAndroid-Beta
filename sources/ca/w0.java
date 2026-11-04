package ca;

import java.util.List;
public final class w0 extends i2 {
    public final List f4576a;
    public final e2 f4577b;
    public final u1 f4578c;
    public final z1 d;
    public final z0 f4579e;
    public final List f4580f;

    public w0(List list, e2 e2Var, u1 u1Var, z1 z1Var, z0 z0Var, List list2) {
        this.f4576a = list;
        this.f4577b = e2Var;
        this.f4578c = u1Var;
        this.d = z1Var;
        this.f4579e = z0Var;
        this.f4580f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i2) {
                i2 i2Var = (i2) obj;
                List list = this.f4576a;
                if (list == null) {
                    if (((w0) i2Var).f4576a != null) {
                        return false;
                    }
                } else if (!list.equals(((w0) i2Var).f4576a)) {
                    return false;
                }
                e2 e2Var = this.f4577b;
                if (e2Var == null) {
                    if (((w0) i2Var).f4577b != null) {
                        return false;
                    }
                } else if (!e2Var.equals(((w0) i2Var).f4577b)) {
                    return false;
                }
                u1 u1Var = this.f4578c;
                if (u1Var == null) {
                    if (((w0) i2Var).f4578c != null) {
                        return false;
                    }
                } else if (!u1Var.equals(((w0) i2Var).f4578c)) {
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
                if (this.f4579e.equals(w0Var.f4579e) && this.f4580f.equals(w0Var.f4580f)) {
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
        int i3 = 0;
        List list = this.f4576a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        e2 e2Var = this.f4577b;
        if (e2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = e2Var.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        u1 u1Var = this.f4578c;
        if (u1Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = u1Var.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        z1 z1Var = this.d;
        if (z1Var != null) {
            i3 = z1Var.hashCode();
        }
        return ((((i3 ^ i12) * 1000003) ^ this.f4579e.hashCode()) * 1000003) ^ this.f4580f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f4576a + ", exception=" + this.f4577b + ", appExitInfo=" + this.f4578c + ", profilingManagerInfo=" + this.d + ", signal=" + this.f4579e + ", binaries=" + this.f4580f + "}";
    }
}
