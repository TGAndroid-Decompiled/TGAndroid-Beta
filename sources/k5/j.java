package k5;
public final class j extends q {
    public final h f14807a;

    public j(h hVar) {
        this.f14807a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f14822a;
                if (obj2.equals(obj2)) {
                    if (this.f14807a.equals(((j) qVar).f14807a)) {
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
        return ((p.f14822a.hashCode() ^ 1000003) * 1000003) ^ this.f14807a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f14822a + ", androidClientInfo=" + this.f14807a + "}";
    }
}
