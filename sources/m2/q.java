package m2;
public final class q {
    public final long f14451a;
    public final long f14452b;

    public q(long j3, long j10) {
        this.f14451a = j3;
        this.f14452b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14451a == qVar.f14451a && this.f14452b == qVar.f14452b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14451a) * 31) + ((int) this.f14452b);
    }
}
