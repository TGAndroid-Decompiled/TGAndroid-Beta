package h9;

public final class q0 extends p1 {

    public final String f8799a;

    public final String f8800b;

    public final long f8801c;

    public q0(long j10, String str, String str2) {
        this.f8799a = str;
        this.f8800b = str2;
        this.f8801c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f8799a.equals(q0Var.f8799a) && this.f8800b.equals(q0Var.f8800b) && this.f8801c == q0Var.f8801c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f8799a.hashCode() ^ 1000003) * 1000003) ^ this.f8800b.hashCode()) * 1000003;
        long j10 = this.f8801c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8799a);
        sb2.append(", code=");
        sb2.append(this.f8800b);
        sb2.append(", address=");
        return a9.p.o(sb2, this.f8801c, "}");
    }
}
