package da;
public final class j1 extends o2 {
    public final n2 f8389a;
    public final String f8390b;
    public final String f8391c;
    public final long d;

    public j1(k1 k1Var, String str, String str2, long j3) {
        this.f8389a = k1Var;
        this.f8390b = str;
        this.f8391c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f8389a.equals(j1Var.f8389a) && this.f8390b.equals(j1Var.f8390b) && this.f8391c.equals(j1Var.f8391c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f8389a.hashCode() ^ 1000003) * 1000003) ^ this.f8390b.hashCode()) * 1000003) ^ this.f8391c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f8389a);
        sb2.append(", parameterKey=");
        sb2.append(this.f8390b);
        sb2.append(", parameterValue=");
        sb2.append(this.f8391c);
        sb2.append(", templateVersion=");
        return a8.p0.r(sb2, this.d, "}");
    }
}
