package n5;
public final class o extends a0 {
    public final r f20460a;

    public o(r rVar) {
        z zVar = z.f20482a;
        this.f20460a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f20460a.equals(((o) ((a0) obj)).f20460a)) {
                    Object obj2 = z.f20482a;
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
        return ((this.f20460a.hashCode() ^ 1000003) * 1000003) ^ z.f20482a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f20460a + ", productIdOrigin=" + z.f20482a + "}";
    }
}
