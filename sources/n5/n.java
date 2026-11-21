package n5;
public final class n extends y {
    public final l f21420a;

    public n(l lVar) {
        this.f21420a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f21441a;
                if (obj2.equals(obj2)) {
                    if (this.f21420a.equals(((n) yVar).f21420a)) {
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
        return ((x.f21441a.hashCode() ^ 1000003) * 1000003) ^ this.f21420a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f21441a + ", androidClientInfo=" + this.f21420a + "}";
    }
}
