package k5;
public final class n extends v {
    public final u f13476a;
    public final t f13477b;

    public n(u uVar, t tVar) {
        this.f13476a = uVar;
        this.f13477b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f13476a;
            if (uVar != null ? uVar.equals(((n) vVar).f13476a) : ((n) vVar).f13476a == null) {
                t tVar = this.f13477b;
                if (tVar != null ? tVar.equals(((n) vVar).f13477b) : ((n) vVar).f13477b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f13476a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f13477b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13476a + ", mobileSubtype=" + this.f13477b + "}";
    }
}
