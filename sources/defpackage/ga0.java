package defpackage;
public final class ga0 extends m03 {
    public final ha0 a;
    public final String b;
    public final String c;
    public final long d;

    public ga0(ha0 ha0Var, String str, String str2, long j) {
        this.a = ha0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof m03) {
                ga0 ga0Var = (ga0) ((m03) obj);
                if (this.a.equals(ga0Var.a) && this.b.equals(ga0Var.b) && this.c.equals(ga0Var.c) && this.d == ga0Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.d;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return kt6.q(sb, this.d, "}");
    }
}
