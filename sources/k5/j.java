package k5;
public final class j extends q {
    public final h f14140a;

    public j(h hVar) {
        this.f14140a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f14153a;
                if (obj2.equals(obj2)) {
                    if (this.f14140a.equals(((j) qVar).f14140a)) {
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
        return ((p.f14153a.hashCode() ^ 1000003) * 1000003) ^ this.f14140a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f14153a + ", androidClientInfo=" + this.f14140a + "}";
    }
}
