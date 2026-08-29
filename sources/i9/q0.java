package i9;
public final class q0 extends p1 {
    public final String f8763a;
    public final String f8764b;
    public final long f8765c;

    public q0(long j10, String str, String str2) {
        this.f8763a = str;
        this.f8764b = str2;
        this.f8765c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f8763a.equals(q0Var.f8763a) && this.f8764b.equals(q0Var.f8764b) && this.f8765c == q0Var.f8765c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8765c;
        return ((((this.f8763a.hashCode() ^ 1000003) * 1000003) ^ this.f8764b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8763a);
        sb2.append(", code=");
        sb2.append(this.f8764b);
        sb2.append(", address=");
        return a4.w.p(sb2, this.f8765c, "}");
    }
}
