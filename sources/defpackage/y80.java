package defpackage;
public final class y80 extends tq2 {
    public final ta0 a;

    public y80(ta0 ta0Var) {
        sq2 sq2Var = sq2.a;
        this.a = ta0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof tq2) {
                if (this.a.equals(((y80) ((tq2) obj)).a)) {
                    Object obj2 = sq2.a;
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
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ sq2.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + sq2.a + "}";
    }
}
