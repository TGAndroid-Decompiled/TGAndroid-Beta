package k5;
public final class n extends v {
    public final u f13478a;
    public final t f13479b;

    public n(u uVar, t tVar) {
        this.f13478a = uVar;
        this.f13479b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f13478a;
            if (uVar != null ? uVar.equals(((n) vVar).f13478a) : ((n) vVar).f13478a == null) {
                t tVar = this.f13479b;
                if (tVar != null ? tVar.equals(((n) vVar).f13479b) : ((n) vVar).f13479b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f13478a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f13479b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13478a + ", mobileSubtype=" + this.f13479b + "}";
    }
}
