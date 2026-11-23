package n5;
public final class n extends y {
    public final l f21488a;

    public n(l lVar) {
        this.f21488a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f21509a;
                if (obj2.equals(obj2)) {
                    if (this.f21488a.equals(((n) yVar).f21488a)) {
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
        return ((x.f21509a.hashCode() ^ 1000003) * 1000003) ^ this.f21488a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f21509a + ", androidClientInfo=" + this.f21488a + "}";
    }
}
