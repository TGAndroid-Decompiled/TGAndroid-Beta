package k5;
public final class n extends v {
    public final u f14652a;
    public final t f14653b;

    public n(u uVar, t tVar) {
        this.f14652a = uVar;
        this.f14653b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f14652a;
            if (uVar != null ? uVar.equals(((n) vVar).f14652a) : ((n) vVar).f14652a == null) {
                t tVar = this.f14653b;
                if (tVar != null ? tVar.equals(((n) vVar).f14653b) : ((n) vVar).f14653b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f14652a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f14653b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14652a + ", mobileSubtype=" + this.f14653b + "}";
    }
}
