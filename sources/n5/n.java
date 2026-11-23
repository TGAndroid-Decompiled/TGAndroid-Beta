package n5;
public final class n extends y {
    public final l f21423a;

    public n(l lVar) {
        this.f21423a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f21444a;
                if (obj2.equals(obj2)) {
                    if (this.f21423a.equals(((n) yVar).f21423a)) {
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
        return ((x.f21444a.hashCode() ^ 1000003) * 1000003) ^ this.f21423a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f21444a + ", androidClientInfo=" + this.f21423a + "}";
    }
}
