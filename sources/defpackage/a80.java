package defpackage;
public final class a80 extends bq2 {
    public final v90 a;

    public a80(v90 v90Var) {
        aq2 aq2Var = aq2.a;
        this.a = v90Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof bq2) {
                if (this.a.equals(((a80) ((bq2) obj)).a)) {
                    Object obj2 = aq2.a;
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
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ aq2.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + aq2.a + "}";
    }
}
