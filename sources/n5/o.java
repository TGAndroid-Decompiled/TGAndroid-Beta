package n5;
public final class o extends a0 {
    public final r f21396a;

    public o(r rVar) {
        z zVar = z.f21418a;
        this.f21396a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f21396a.equals(((o) ((a0) obj)).f21396a)) {
                    Object obj2 = z.f21418a;
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
        return ((this.f21396a.hashCode() ^ 1000003) * 1000003) ^ z.f21418a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f21396a + ", productIdOrigin=" + z.f21418a + "}";
    }
}
