package n5;
public final class o extends a0 {
    public final r f21393a;

    public o(r rVar) {
        z zVar = z.f21415a;
        this.f21393a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f21393a.equals(((o) ((a0) obj)).f21393a)) {
                    Object obj2 = z.f21415a;
                    if (obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21393a.hashCode() ^ 1000003) * 1000003) ^ z.f21415a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f21393a + ", productIdOrigin=" + z.f21415a + "}";
    }
}
