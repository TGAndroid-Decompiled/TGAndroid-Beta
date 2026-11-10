package n5;
public final class n extends y {
    public final l f20467a;

    public n(l lVar) {
        this.f20467a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f20488a;
                if (obj2.equals(obj2)) {
                    if (this.f20467a.equals(((n) yVar).f20467a)) {
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
        return ((x.f20488a.hashCode() ^ 1000003) * 1000003) ^ this.f20467a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f20488a + ", androidClientInfo=" + this.f20467a + "}";
    }
}
