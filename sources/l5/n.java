package l5;
public final class n extends v {
    public final u f16910a;
    public final t f16911b;

    public n(u uVar, t tVar) {
        this.f16910a = uVar;
        this.f16911b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f16910a;
            if (uVar != null ? uVar.equals(((n) vVar).f16910a) : ((n) vVar).f16910a == null) {
                t tVar = this.f16911b;
                if (tVar != null ? tVar.equals(((n) vVar).f16911b) : ((n) vVar).f16911b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f16910a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f16911b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16910a + ", mobileSubtype=" + this.f16911b + "}";
    }
}
