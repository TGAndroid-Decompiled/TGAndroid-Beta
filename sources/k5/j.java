package k5;
public final class j extends q {
    public final h f13467a;

    public j(h hVar) {
        this.f13467a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f13480a;
                if (obj2.equals(obj2)) {
                    if (this.f13467a.equals(((j) qVar).f13467a)) {
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
        return ((p.f13480a.hashCode() ^ 1000003) * 1000003) ^ this.f13467a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f13480a + ", androidClientInfo=" + this.f13467a + "}";
    }
}
