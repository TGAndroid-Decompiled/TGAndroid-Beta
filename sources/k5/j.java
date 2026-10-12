package k5;
public final class j extends q {
    public final h f14668a;

    public j(h hVar) {
        this.f14668a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f14683a;
                if (obj2.equals(obj2)) {
                    if (this.f14668a.equals(((j) qVar).f14668a)) {
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
        return ((p.f14683a.hashCode() ^ 1000003) * 1000003) ^ this.f14668a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f14683a + ", androidClientInfo=" + this.f14668a + "}";
    }
}
