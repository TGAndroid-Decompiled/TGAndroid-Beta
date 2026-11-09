package da;
public final class j1 extends o2 {
    public final n2 f8384a;
    public final String f8385b;
    public final String f8386c;
    public final long d;

    public j1(k1 k1Var, String str, String str2, long j3) {
        this.f8384a = k1Var;
        this.f8385b = str;
        this.f8386c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f8384a.equals(j1Var.f8384a) && this.f8385b.equals(j1Var.f8385b) && this.f8386c.equals(j1Var.f8386c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f8384a.hashCode() ^ 1000003) * 1000003) ^ this.f8385b.hashCode()) * 1000003) ^ this.f8386c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f8384a);
        sb2.append(", parameterKey=");
        sb2.append(this.f8385b);
        sb2.append(", parameterValue=");
        sb2.append(this.f8386c);
        sb2.append(", templateVersion=");
        return a8.p0.r(sb2, this.d, "}");
    }
}
