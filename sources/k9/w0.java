package k9;
public final class w0 extends y1 {
    public final x1 f10263a;
    public final String f10264b;
    public final String f10265c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f10263a = x0Var;
        this.f10264b = str;
        this.f10265c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f10263a.equals(w0Var.f10263a) && this.f10264b.equals(w0Var.f10264b) && this.f10265c.equals(w0Var.f10265c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f10263a.hashCode() ^ 1000003) * 1000003) ^ this.f10264b.hashCode()) * 1000003) ^ this.f10265c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f10263a);
        sb.append(", parameterKey=");
        sb.append(this.f10264b);
        sb.append(", parameterValue=");
        sb.append(this.f10265c);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.q(sb, this.d, "}");
    }
}
