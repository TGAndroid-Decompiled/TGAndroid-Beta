package n5;
public final class v extends i0 {
    public final h0 f20478a;
    public final g0 f20479b;

    public v(h0 h0Var, g0 g0Var) {
        this.f20478a = h0Var;
        this.f20479b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f20478a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f20478a) : ((v) i0Var).f20478a == null) {
                g0 g0Var = this.f20479b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f20479b) : ((v) i0Var).f20479b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        h0 h0Var = this.f20478a;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        g0 g0Var = this.f20479b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        }
        return i7 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20478a + ", mobileSubtype=" + this.f20479b + "}";
    }
}
