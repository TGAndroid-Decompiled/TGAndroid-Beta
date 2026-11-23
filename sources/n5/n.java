package n5;
public final class n extends y {
    public final l f21389a;

    public n(l lVar) {
        this.f21389a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f21410a;
                if (obj2.equals(obj2)) {
                    if (this.f21389a.equals(((n) yVar).f21389a)) {
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
        return ((x.f21410a.hashCode() ^ 1000003) * 1000003) ^ this.f21389a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f21410a + ", androidClientInfo=" + this.f21389a + "}";
    }
}
