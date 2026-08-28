package g9;
public final class w0 extends y1 {
    public final x1 f7672a;
    public final String f7673b;
    public final String f7674c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f7672a = x0Var;
        this.f7673b = str;
        this.f7674c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f7672a.equals(w0Var.f7672a) && this.f7673b.equals(w0Var.f7673b) && this.f7674c.equals(w0Var.f7674c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f7672a.hashCode() ^ 1000003) * 1000003) ^ this.f7673b.hashCode()) * 1000003) ^ this.f7674c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f7672a);
        sb2.append(", parameterKey=");
        sb2.append(this.f7673b);
        sb2.append(", parameterValue=");
        sb2.append(this.f7674c);
        sb2.append(", templateVersion=");
        return aa.d.q(sb2, this.d, "}");
    }
}
