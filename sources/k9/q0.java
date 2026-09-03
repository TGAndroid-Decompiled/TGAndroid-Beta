package k9;
public final class q0 extends p1 {
    public final String f10205a;
    public final String f10206b;
    public final long f10207c;

    public q0(long j10, String str, String str2) {
        this.f10205a = str;
        this.f10206b = str2;
        this.f10207c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f10205a.equals(q0Var.f10205a) && this.f10206b.equals(q0Var.f10206b) && this.f10207c == q0Var.f10207c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10207c;
        return ((((this.f10205a.hashCode() ^ 1000003) * 1000003) ^ this.f10206b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f10205a);
        sb.append(", code=");
        sb.append(this.f10206b);
        sb.append(", address=");
        return android.support.v4.media.a.q(sb, this.f10207c, "}");
    }
}
