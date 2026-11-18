package da;
public final class j1 extends o2 {
    public final n2 f8058a;
    public final String f8059b;
    public final String f8060c;
    public final long d;

    public j1(k1 k1Var, String str, String str2, long j3) {
        this.f8058a = k1Var;
        this.f8059b = str;
        this.f8060c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f8058a.equals(j1Var.f8058a) && this.f8059b.equals(j1Var.f8059b) && this.f8060c.equals(j1Var.f8060c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f8058a.hashCode() ^ 1000003) * 1000003) ^ this.f8059b.hashCode()) * 1000003) ^ this.f8060c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f8058a);
        sb2.append(", parameterKey=");
        sb2.append(this.f8059b);
        sb2.append(", parameterValue=");
        sb2.append(this.f8060c);
        sb2.append(", templateVersion=");
        return a8.p0.r(sb2, this.d, "}");
    }
}
