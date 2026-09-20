package k5;
public final class j extends q {
    public final h f13479a;

    public j(h hVar) {
        this.f13479a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f13492a;
                if (obj2.equals(obj2)) {
                    if (this.f13479a.equals(((j) qVar).f13479a)) {
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
        return ((p.f13492a.hashCode() ^ 1000003) * 1000003) ^ this.f13479a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f13492a + ", androidClientInfo=" + this.f13479a + "}";
    }
}
