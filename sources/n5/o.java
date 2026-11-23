package n5;
public final class o extends a0 {
    public final r f21424a;

    public o(r rVar) {
        z zVar = z.f21446a;
        this.f21424a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f21424a.equals(((o) ((a0) obj)).f21424a)) {
                    Object obj2 = z.f21446a;
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
        return ((this.f21424a.hashCode() ^ 1000003) * 1000003) ^ z.f21446a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f21424a + ", productIdOrigin=" + z.f21446a + "}";
    }
}
