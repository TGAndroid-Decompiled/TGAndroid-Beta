package k5;
public final class j extends q {
    public final h f10905a;

    public j(h hVar) {
        this.f10905a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f10918a;
                if (obj2.equals(obj2)) {
                    if (this.f10905a.equals(((j) qVar).f10905a)) {
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
        return ((p.f10918a.hashCode() ^ 1000003) * 1000003) ^ this.f10905a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f10918a + ", androidClientInfo=" + this.f10905a + "}";
    }
}
