package defpackage;
public final class y70 extends ip2 {
    public final t90 a;

    public y70(t90 t90Var) {
        hp2 hp2Var = hp2.a;
        this.a = t90Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ip2) {
                if (this.a.equals(((y70) ((ip2) obj)).a)) {
                    Object obj2 = hp2.a;
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
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ hp2.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + hp2.a + "}";
    }
}
