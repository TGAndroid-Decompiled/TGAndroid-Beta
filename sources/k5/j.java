package k5;
public final class j extends q {
    public final h f13465a;

    public j(h hVar) {
        this.f13465a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f13478a;
                if (obj2.equals(obj2)) {
                    if (this.f13465a.equals(((j) qVar).f13465a)) {
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
        return ((p.f13478a.hashCode() ^ 1000003) * 1000003) ^ this.f13465a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f13478a + ", androidClientInfo=" + this.f13465a + "}";
    }
}
