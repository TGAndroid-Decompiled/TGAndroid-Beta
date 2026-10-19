package k5;
public final class j extends q {
    public final h f14941a;

    public j(h hVar) {
        this.f14941a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f14954a;
                if (obj2.equals(obj2)) {
                    if (this.f14941a.equals(((j) qVar).f14941a)) {
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
        return ((p.f14954a.hashCode() ^ 1000003) * 1000003) ^ this.f14941a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f14954a + ", androidClientInfo=" + this.f14941a + "}";
    }
}
