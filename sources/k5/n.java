package k5;
public final class n extends v {
    public final u f14653a;
    public final t f14654b;

    public n(u uVar, t tVar) {
        this.f14653a = uVar;
        this.f14654b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f14653a;
            if (uVar != null ? uVar.equals(((n) vVar).f14653a) : ((n) vVar).f14653a == null) {
                t tVar = this.f14654b;
                if (tVar != null ? tVar.equals(((n) vVar).f14654b) : ((n) vVar).f14654b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f14653a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f14654b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14653a + ", mobileSubtype=" + this.f14654b + "}";
    }
}
