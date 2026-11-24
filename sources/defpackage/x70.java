package defpackage;
public final class x70 extends li2 {
    public final u70 a;

    public x70(u70 u70Var) {
        this.a = u70Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof li2) {
                li2 li2Var = (li2) obj;
                Object obj2 = ki2.a;
                if (obj2.equals(obj2)) {
                    if (this.a.equals(((x70) li2Var).a)) {
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
        return ((ki2.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ki2.a + ", androidClientInfo=" + this.a + "}";
    }
}
