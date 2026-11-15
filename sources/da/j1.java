package da;
public final class j1 extends o2 {
    public final n2 f7776a;
    public final String f7777b;
    public final String f7778c;
    public final long d;

    public j1(k1 k1Var, String str, String str2, long j3) {
        this.f7776a = k1Var;
        this.f7777b = str;
        this.f7778c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f7776a.equals(j1Var.f7776a) && this.f7777b.equals(j1Var.f7777b) && this.f7778c.equals(j1Var.f7778c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f7776a.hashCode() ^ 1000003) * 1000003) ^ this.f7777b.hashCode()) * 1000003) ^ this.f7778c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f7776a);
        sb2.append(", parameterKey=");
        sb2.append(this.f7777b);
        sb2.append(", parameterValue=");
        sb2.append(this.f7778c);
        sb2.append(", templateVersion=");
        return a8.p0.r(sb2, this.d, "}");
    }
}
