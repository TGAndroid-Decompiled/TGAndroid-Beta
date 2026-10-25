package l5;
public final class j extends q {
    public final h f16900a;

    public j(h hVar) {
        this.f16900a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f16913a;
                if (obj2.equals(obj2)) {
                    if (this.f16900a.equals(((j) qVar).f16900a)) {
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
        return ((p.f16913a.hashCode() ^ 1000003) * 1000003) ^ this.f16900a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f16913a + ", androidClientInfo=" + this.f16900a + "}";
    }
}
