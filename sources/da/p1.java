package da;
public final class p1 {
    public final q1 f8169a;
    public final s1 f8170b;
    public final r1 f8171c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8169a = q1Var;
        this.f8170b = s1Var;
        this.f8171c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8169a.equals(p1Var.f8169a) && this.f8170b.equals(p1Var.f8170b) && this.f8171c.equals(p1Var.f8171c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8169a.hashCode() ^ 1000003) * 1000003) ^ this.f8170b.hashCode()) * 1000003) ^ this.f8171c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8169a + ", osData=" + this.f8170b + ", deviceData=" + this.f8171c + "}";
    }
}
