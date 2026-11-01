package k5;
public final class n extends v {
    public final u f10916a;
    public final t f10917b;

    public n(u uVar, t tVar) {
        this.f10916a = uVar;
        this.f10917b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f10916a;
            if (uVar != null ? uVar.equals(((n) vVar).f10916a) : ((n) vVar).f10916a == null) {
                t tVar = this.f10917b;
                if (tVar != null ? tVar.equals(((n) vVar).f10917b) : ((n) vVar).f10917b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f10916a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f10917b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10916a + ", mobileSubtype=" + this.f10917b + "}";
    }
}
