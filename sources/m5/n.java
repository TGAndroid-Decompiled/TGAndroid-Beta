package m5;
public final class n extends y {
    public final l f19150a;

    public n(l lVar) {
        this.f19150a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f19171a;
                if (obj2.equals(obj2)) {
                    if (this.f19150a.equals(((n) yVar).f19150a)) {
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
        return ((x.f19171a.hashCode() ^ 1000003) * 1000003) ^ this.f19150a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f19171a + ", androidClientInfo=" + this.f19150a + "}";
    }
}
