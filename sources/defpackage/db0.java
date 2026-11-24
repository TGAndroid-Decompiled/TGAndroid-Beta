package defpackage;
public final class db0 extends al7 {
    public final zk7 a;
    public final yk7 b;

    public db0(zk7 zk7Var, yk7 yk7Var) {
        this.a = zk7Var;
        this.b = yk7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof al7) {
            al7 al7Var = (al7) obj;
            zk7 zk7Var = this.a;
            if (zk7Var != null ? zk7Var.equals(((db0) al7Var).a) : ((db0) al7Var).a == null) {
                yk7 yk7Var = this.b;
                db0 db0Var = (db0) al7Var;
                if (yk7Var != null ? yk7Var.equals(db0Var.b) : db0Var.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        zk7 zk7Var = this.a;
        if (zk7Var == null) {
            hashCode = 0;
        } else {
            hashCode = zk7Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        yk7 yk7Var = this.b;
        if (yk7Var != null) {
            i = yk7Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
