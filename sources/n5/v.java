package n5;
public final class v extends i0 {
    public final h0 f20486a;
    public final g0 f20487b;

    public v(h0 h0Var, g0 g0Var) {
        this.f20486a = h0Var;
        this.f20487b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f20486a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f20486a) : ((v) i0Var).f20486a == null) {
                g0 g0Var = this.f20487b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f20487b) : ((v) i0Var).f20487b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        h0 h0Var = this.f20486a;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        g0 g0Var = this.f20487b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        }
        return i7 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20486a + ", mobileSubtype=" + this.f20487b + "}";
    }
}
