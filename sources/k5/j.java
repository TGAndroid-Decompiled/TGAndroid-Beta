package k5;
public final class j extends q {
    public final h f13480a;

    public j(h hVar) {
        this.f13480a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f13493a;
                if (obj2.equals(obj2)) {
                    if (this.f13480a.equals(((j) qVar).f13480a)) {
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
        return ((p.f13493a.hashCode() ^ 1000003) * 1000003) ^ this.f13480a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f13493a + ", androidClientInfo=" + this.f13480a + "}";
    }
}
