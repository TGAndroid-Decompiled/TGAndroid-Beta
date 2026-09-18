package k5;
public final class j extends q {
    public final h f13478a;

    public j(h hVar) {
        this.f13478a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f13491a;
                if (obj2.equals(obj2)) {
                    if (this.f13478a.equals(((j) qVar).f13478a)) {
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
        return ((p.f13491a.hashCode() ^ 1000003) * 1000003) ^ this.f13478a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f13491a + ", androidClientInfo=" + this.f13478a + "}";
    }
}
