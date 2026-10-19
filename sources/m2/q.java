package m2;
public final class q {
    public final long f16463a;
    public final long f16464b;

    public q(long j10, long j11) {
        this.f16463a = j10;
        this.f16464b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16463a == qVar.f16463a && this.f16464b == qVar.f16464b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16463a) * 31) + ((int) this.f16464b);
    }
}
