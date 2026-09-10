package k5;
public final class n extends v {
    public final u f12334a;
    public final t f12335b;

    public n(u uVar, t tVar) {
        this.f12334a = uVar;
        this.f12335b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f12334a;
            if (uVar != null ? uVar.equals(((n) vVar).f12334a) : ((n) vVar).f12334a == null) {
                t tVar = this.f12335b;
                if (tVar != null ? tVar.equals(((n) vVar).f12335b) : ((n) vVar).f12335b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f12334a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f12335b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f12334a + ", mobileSubtype=" + this.f12335b + "}";
    }
}
