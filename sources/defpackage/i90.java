package defpackage;
public final class i90 extends wz2 {
    public final j90 a;
    public final String b;
    public final String c;
    public final long d;

    public i90(j90 j90Var, String str, String str2, long j) {
        this.a = j90Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wz2) {
                i90 i90Var = (i90) ((wz2) obj);
                if (this.a.equals(i90Var.a) && this.b.equals(i90Var.b) && this.c.equals(i90Var.c) && this.d == i90Var.d) {
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
        return qu6.p(sb, this.d, "}");
    }
}
