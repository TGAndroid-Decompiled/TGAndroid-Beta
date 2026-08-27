package h9;

public final class w0 extends y1 {

    public final x1 f8843a;

    public final String f8844b;

    public final String f8845c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f8843a = x0Var;
        this.f8844b = str;
        this.f8845c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f8843a.equals(w0Var.f8843a) && this.f8844b.equals(w0Var.f8844b) && this.f8845c.equals(w0Var.f8845c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f8843a.hashCode() ^ 1000003) * 1000003) ^ this.f8844b.hashCode()) * 1000003) ^ this.f8845c.hashCode()) * 1000003;
        long j10 = this.d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f8843a);
        sb2.append(", parameterKey=");
        sb2.append(this.f8844b);
        sb2.append(", parameterValue=");
        sb2.append(this.f8845c);
        sb2.append(", templateVersion=");
        return a9.p.o(sb2, this.d, "}");
    }
}
