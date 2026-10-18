package k5;
public final class n extends v {
    public final u f14951a;
    public final t f14952b;

    public n(u uVar, t tVar) {
        this.f14951a = uVar;
        this.f14952b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f14951a;
            if (uVar != null ? uVar.equals(((n) vVar).f14951a) : ((n) vVar).f14951a == null) {
                t tVar = this.f14952b;
                if (tVar != null ? tVar.equals(((n) vVar).f14952b) : ((n) vVar).f14952b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f14951a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f14952b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14951a + ", mobileSubtype=" + this.f14952b + "}";
    }
}
