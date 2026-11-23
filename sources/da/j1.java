package da;
public final class j1 extends o2 {
    public final n2 f8087a;
    public final String f8088b;
    public final String f8089c;
    public final long d;

    public j1(k1 k1Var, String str, String str2, long j3) {
        this.f8087a = k1Var;
        this.f8088b = str;
        this.f8089c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f8087a.equals(j1Var.f8087a) && this.f8088b.equals(j1Var.f8088b) && this.f8089c.equals(j1Var.f8089c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f8087a.hashCode() ^ 1000003) * 1000003) ^ this.f8088b.hashCode()) * 1000003) ^ this.f8089c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f8087a);
        sb2.append(", parameterKey=");
        sb2.append(this.f8088b);
        sb2.append(", parameterValue=");
        sb2.append(this.f8089c);
        sb2.append(", templateVersion=");
        return a8.p0.r(sb2, this.d, "}");
    }
}
