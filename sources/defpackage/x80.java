package defpackage;
public final class x80 extends zj2 {
    public final u80 a;

    public x80(u80 u80Var) {
        this.a = u80Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zj2) {
                zj2 zj2Var = (zj2) obj;
                Object obj2 = yj2.a;
                if (obj2.equals(obj2)) {
                    if (this.a.equals(((x80) zj2Var).a)) {
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
        return ((yj2.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + yj2.a + ", androidClientInfo=" + this.a + "}";
    }
}
