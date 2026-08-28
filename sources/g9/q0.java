package g9;
public final class q0 extends p1 {
    public final String f7628a;
    public final String f7629b;
    public final long f7630c;

    public q0(long j10, String str, String str2) {
        this.f7628a = str;
        this.f7629b = str2;
        this.f7630c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f7628a.equals(q0Var.f7628a) && this.f7629b.equals(q0Var.f7629b) && this.f7630c == q0Var.f7630c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7630c;
        return ((((this.f7628a.hashCode() ^ 1000003) * 1000003) ^ this.f7629b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f7628a);
        sb2.append(", code=");
        sb2.append(this.f7629b);
        sb2.append(", address=");
        return aa.d.q(sb2, this.f7630c, "}");
    }
}
