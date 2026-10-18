package k5;
public final class j extends q {
    public final h f14940a;

    public j(h hVar) {
        this.f14940a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f14953a;
                if (obj2.equals(obj2)) {
                    if (this.f14940a.equals(((j) qVar).f14940a)) {
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
        return ((p.f14953a.hashCode() ^ 1000003) * 1000003) ^ this.f14940a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f14953a + ", androidClientInfo=" + this.f14940a + "}";
    }
}
