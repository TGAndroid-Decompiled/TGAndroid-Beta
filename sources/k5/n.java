package k5;
public final class n extends v {
    public final u f14952a;
    public final t f14953b;

    public n(u uVar, t tVar) {
        this.f14952a = uVar;
        this.f14953b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f14952a;
            if (uVar != null ? uVar.equals(((n) vVar).f14952a) : ((n) vVar).f14952a == null) {
                t tVar = this.f14953b;
                if (tVar != null ? tVar.equals(((n) vVar).f14953b) : ((n) vVar).f14953b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f14952a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f14953b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14952a + ", mobileSubtype=" + this.f14953b + "}";
    }
}
