package k9;
public final class w0 extends y1 {
    public final x1 f11027a;
    public final String f11028b;
    public final String f11029c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f11027a = x0Var;
        this.f11028b = str;
        this.f11029c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f11027a.equals(w0Var.f11027a) && this.f11028b.equals(w0Var.f11028b) && this.f11029c.equals(w0Var.f11029c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f11027a.hashCode() ^ 1000003) * 1000003) ^ this.f11028b.hashCode()) * 1000003) ^ this.f11029c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f11027a);
        sb.append(", parameterKey=");
        sb.append(this.f11028b);
        sb.append(", parameterValue=");
        sb.append(this.f11029c);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.q(sb, this.d, "}");
    }
}
