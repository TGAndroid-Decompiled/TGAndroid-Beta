package k5;
public final class j extends q {
    public final h f13477a;

    public j(h hVar) {
        this.f13477a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f13490a;
                if (obj2.equals(obj2)) {
                    if (this.f13477a.equals(((j) qVar).f13477a)) {
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
        return ((p.f13490a.hashCode() ^ 1000003) * 1000003) ^ this.f13477a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f13490a + ", androidClientInfo=" + this.f13477a + "}";
    }
}
