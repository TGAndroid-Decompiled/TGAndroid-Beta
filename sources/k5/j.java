package k5;
public final class j extends q {
    public final h f14987a;

    public j(h hVar) {
        this.f14987a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f15000a;
                if (obj2.equals(obj2)) {
                    if (this.f14987a.equals(((j) qVar).f14987a)) {
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
        return ((p.f15000a.hashCode() ^ 1000003) * 1000003) ^ this.f14987a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f15000a + ", androidClientInfo=" + this.f14987a + "}";
    }
}
