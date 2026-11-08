package n5;
public final class n extends y {
    public final l f20462a;

    public n(l lVar) {
        this.f20462a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f20483a;
                if (obj2.equals(obj2)) {
                    if (this.f20462a.equals(((n) yVar).f20462a)) {
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
        return ((x.f20483a.hashCode() ^ 1000003) * 1000003) ^ this.f20462a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f20483a + ", androidClientInfo=" + this.f20462a + "}";
    }
}
