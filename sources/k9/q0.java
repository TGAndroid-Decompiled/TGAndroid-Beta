package k9;
public final class q0 extends p1 {
    public final String f10225a;
    public final String f10226b;
    public final long f10227c;

    public q0(long j10, String str, String str2) {
        this.f10225a = str;
        this.f10226b = str2;
        this.f10227c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f10225a.equals(q0Var.f10225a) && this.f10226b.equals(q0Var.f10226b) && this.f10227c == q0Var.f10227c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10227c;
        return ((((this.f10225a.hashCode() ^ 1000003) * 1000003) ^ this.f10226b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f10225a);
        sb.append(", code=");
        sb.append(this.f10226b);
        sb.append(", address=");
        return android.support.v4.media.a.q(sb, this.f10227c, "}");
    }
}
