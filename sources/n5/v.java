package n5;
public final class v extends i0 {
    public final h0 f21414a;
    public final g0 f21415b;

    public v(h0 h0Var, g0 g0Var) {
        this.f21414a = h0Var;
        this.f21415b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f21414a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f21414a) : ((v) i0Var).f21414a == null) {
                g0 g0Var = this.f21415b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f21415b) : ((v) i0Var).f21415b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        h0 h0Var = this.f21414a;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        g0 g0Var = this.f21415b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        }
        return i7 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21414a + ", mobileSubtype=" + this.f21415b + "}";
    }
}
