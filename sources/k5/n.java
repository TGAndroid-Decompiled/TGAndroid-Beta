package k5;
public final class n extends v {
    public final u f14685a;
    public final t f14686b;

    public n(u uVar, t tVar) {
        this.f14685a = uVar;
        this.f14686b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f14685a;
            if (uVar != null ? uVar.equals(((n) vVar).f14685a) : ((n) vVar).f14685a == null) {
                t tVar = this.f14686b;
                if (tVar != null ? tVar.equals(((n) vVar).f14686b) : ((n) vVar).f14686b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f14685a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f14686b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14685a + ", mobileSubtype=" + this.f14686b + "}";
    }
}
