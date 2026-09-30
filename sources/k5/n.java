package k5;
public final class n extends v {
    public final u f13491a;
    public final t f13492b;

    public n(u uVar, t tVar) {
        this.f13491a = uVar;
        this.f13492b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f13491a;
            if (uVar != null ? uVar.equals(((n) vVar).f13491a) : ((n) vVar).f13491a == null) {
                t tVar = this.f13492b;
                if (tVar != null ? tVar.equals(((n) vVar).f13492b) : ((n) vVar).f13492b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f13491a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f13492b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13491a + ", mobileSubtype=" + this.f13492b + "}";
    }
}
