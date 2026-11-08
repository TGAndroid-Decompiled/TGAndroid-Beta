package n5;
public final class v extends i0 {
    public final h0 f20481a;
    public final g0 f20482b;

    public v(h0 h0Var, g0 g0Var) {
        this.f20481a = h0Var;
        this.f20482b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f20481a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f20481a) : ((v) i0Var).f20481a == null) {
                g0 g0Var = this.f20482b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f20482b) : ((v) i0Var).f20482b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        h0 h0Var = this.f20481a;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        g0 g0Var = this.f20482b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        }
        return i7 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20481a + ", mobileSubtype=" + this.f20482b + "}";
    }
}
