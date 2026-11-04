package m5;
public final class o extends a0 {
    public final r f19151a;

    public o(r rVar) {
        z zVar = z.f19173a;
        this.f19151a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f19151a.equals(((o) ((a0) obj)).f19151a)) {
                    Object obj2 = z.f19173a;
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
        return ((this.f19151a.hashCode() ^ 1000003) * 1000003) ^ z.f19173a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f19151a + ", productIdOrigin=" + z.f19173a + "}";
    }
}
