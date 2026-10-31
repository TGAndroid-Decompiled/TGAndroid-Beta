package k5;
public final class j extends q {
    public final h f10904a;

    public j(h hVar) {
        this.f10904a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f10917a;
                if (obj2.equals(obj2)) {
                    if (this.f10904a.equals(((j) qVar).f10904a)) {
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
        return ((p.f10917a.hashCode() ^ 1000003) * 1000003) ^ this.f10904a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f10917a + ", androidClientInfo=" + this.f10904a + "}";
    }
}
