package k5;
public final class j extends q {
    public final h f12323a;

    public j(h hVar) {
        this.f12323a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f12336a;
                if (obj2.equals(obj2)) {
                    if (this.f12323a.equals(((j) qVar).f12323a)) {
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
        return ((p.f12336a.hashCode() ^ 1000003) * 1000003) ^ this.f12323a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f12336a + ", androidClientInfo=" + this.f12323a + "}";
    }
}
