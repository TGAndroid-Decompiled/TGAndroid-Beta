package n5;
public final class o extends a0 {
    public final r f21489a;

    public o(r rVar) {
        z zVar = z.f21511a;
        this.f21489a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f21489a.equals(((o) ((a0) obj)).f21489a)) {
                    Object obj2 = z.f21511a;
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
        return ((this.f21489a.hashCode() ^ 1000003) * 1000003) ^ z.f21511a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f21489a + ", productIdOrigin=" + z.f21511a + "}";
    }
}
