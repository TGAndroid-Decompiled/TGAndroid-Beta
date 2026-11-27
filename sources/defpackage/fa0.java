package defpackage;
public final class fa0 extends gl7 {
    public final fl7 a;
    public final el7 b;

    public fa0(fl7 fl7Var, el7 el7Var) {
        this.a = fl7Var;
        this.b = el7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gl7) {
            gl7 gl7Var = (gl7) obj;
            fl7 fl7Var = this.a;
            if (fl7Var != null ? fl7Var.equals(((fa0) gl7Var).a) : ((fa0) gl7Var).a == null) {
                el7 el7Var = this.b;
                fa0 fa0Var = (fa0) gl7Var;
                if (el7Var != null ? el7Var.equals(fa0Var.b) : fa0Var.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        fl7 fl7Var = this.a;
        if (fl7Var == null) {
            hashCode = 0;
        } else {
            hashCode = fl7Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        el7 el7Var = this.b;
        if (el7Var != null) {
            i = el7Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
