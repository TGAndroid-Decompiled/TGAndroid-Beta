package i9;
public final class w0 extends y1 {
    public final x1 f8807a;
    public final String f8808b;
    public final String f8809c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f8807a = x0Var;
        this.f8808b = str;
        this.f8809c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f8807a.equals(w0Var.f8807a) && this.f8808b.equals(w0Var.f8808b) && this.f8809c.equals(w0Var.f8809c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f8807a.hashCode() ^ 1000003) * 1000003) ^ this.f8808b.hashCode()) * 1000003) ^ this.f8809c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f8807a);
        sb2.append(", parameterKey=");
        sb2.append(this.f8808b);
        sb2.append(", parameterValue=");
        sb2.append(this.f8809c);
        sb2.append(", templateVersion=");
        return a4.w.p(sb2, this.d, "}");
    }
}
