package defpackage;
public final class z70 extends hj2 {
    public final w70 a;

    public z70(w70 w70Var) {
        this.a = w70Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hj2) {
                hj2 hj2Var = (hj2) obj;
                Object obj2 = gj2.a;
                if (obj2.equals(obj2)) {
                    if (this.a.equals(((z70) hj2Var).a)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((gj2.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + gj2.a + ", androidClientInfo=" + this.a + "}";
    }
}
