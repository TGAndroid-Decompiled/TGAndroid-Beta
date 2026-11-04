package ca;
public final class j1 extends o2 {
    public final n2 f4412a;
    public final String f4413b;
    public final String f4414c;
    public final long d;

    public j1(k1 k1Var, String str, String str2, long j10) {
        this.f4412a = k1Var;
        this.f4413b = str;
        this.f4414c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f4412a.equals(j1Var.f4412a) && this.f4413b.equals(j1Var.f4413b) && this.f4414c.equals(j1Var.f4414c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f4412a.hashCode() ^ 1000003) * 1000003) ^ this.f4413b.hashCode()) * 1000003) ^ this.f4414c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f4412a);
        sb2.append(", parameterKey=");
        sb2.append(this.f4413b);
        sb2.append(", parameterValue=");
        sb2.append(this.f4414c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
