package n5;
public final class o extends a0 {
    public final r f20468a;

    public o(r rVar) {
        z zVar = z.f20490a;
        this.f20468a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f20468a.equals(((o) ((a0) obj)).f20468a)) {
                    Object obj2 = z.f20490a;
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
        return ((this.f20468a.hashCode() ^ 1000003) * 1000003) ^ z.f20490a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f20468a + ", productIdOrigin=" + z.f20490a + "}";
    }
}
