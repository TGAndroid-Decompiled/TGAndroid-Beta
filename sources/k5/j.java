package k5;
public final class j extends q {
    public final h f14942a;

    public j(h hVar) {
        this.f14942a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f14955a;
                if (obj2.equals(obj2)) {
                    if (this.f14942a.equals(((j) qVar).f14942a)) {
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
        return ((p.f14955a.hashCode() ^ 1000003) * 1000003) ^ this.f14942a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f14955a + ", androidClientInfo=" + this.f14942a + "}";
    }
}
