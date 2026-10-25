package aa;
public final class y0 extends a2 {
    public final z1 f1229a;
    public final String f1230b;
    public final String f1231c;
    public final long d;

    public y0(z0 z0Var, String str, String str2, long j10) {
        this.f1229a = z0Var;
        this.f1230b = str;
        this.f1231c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            y0 y0Var = (y0) ((a2) obj);
            if (this.f1229a.equals(y0Var.f1229a) && this.f1230b.equals(y0Var.f1230b) && this.f1231c.equals(y0Var.f1231c) && this.d == y0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f1229a.hashCode() ^ 1000003) * 1000003) ^ this.f1230b.hashCode()) * 1000003) ^ this.f1231c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f1229a);
        sb2.append(", parameterKey=");
        sb2.append(this.f1230b);
        sb2.append(", parameterValue=");
        sb2.append(this.f1231c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
