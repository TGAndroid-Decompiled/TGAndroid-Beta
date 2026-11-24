package defpackage;
public final class da0 extends yi7 {
    public final xi7 a;
    public final wi7 b;

    public da0(xi7 xi7Var, wi7 wi7Var) {
        this.a = xi7Var;
        this.b = wi7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yi7) {
            yi7 yi7Var = (yi7) obj;
            xi7 xi7Var = this.a;
            if (xi7Var != null ? xi7Var.equals(((da0) yi7Var).a) : ((da0) yi7Var).a == null) {
                wi7 wi7Var = this.b;
                da0 da0Var = (da0) yi7Var;
                if (wi7Var != null ? wi7Var.equals(da0Var.b) : da0Var.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        xi7 xi7Var = this.a;
        if (xi7Var == null) {
            hashCode = 0;
        } else {
            hashCode = xi7Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        wi7 wi7Var = this.b;
        if (wi7Var != null) {
            i = wi7Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
