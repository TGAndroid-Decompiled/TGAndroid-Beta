package k9;
public final class q0 extends p1 {
    public final String f10983a;
    public final String f10984b;
    public final long f10985c;

    public q0(long j10, String str, String str2) {
        this.f10983a = str;
        this.f10984b = str2;
        this.f10985c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f10983a.equals(q0Var.f10983a) && this.f10984b.equals(q0Var.f10984b) && this.f10985c == q0Var.f10985c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10985c;
        return ((((this.f10983a.hashCode() ^ 1000003) * 1000003) ^ this.f10984b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f10983a);
        sb.append(", code=");
        sb.append(this.f10984b);
        sb.append(", address=");
        return android.support.v4.media.a.q(sb, this.f10985c, "}");
    }
}
