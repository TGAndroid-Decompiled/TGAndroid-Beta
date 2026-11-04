package m5;
public final class v extends i0 {
    public final h0 f19169a;
    public final g0 f19170b;

    public v(h0 h0Var, g0 g0Var) {
        this.f19169a = h0Var;
        this.f19170b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f19169a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f19169a) : ((v) i0Var).f19169a == null) {
                g0 g0Var = this.f19170b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f19170b) : ((v) i0Var).f19170b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        h0 h0Var = this.f19169a;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        g0 g0Var = this.f19170b;
        if (g0Var != null) {
            i3 = g0Var.hashCode();
        }
        return i3 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f19169a + ", mobileSubtype=" + this.f19170b + "}";
    }
}
