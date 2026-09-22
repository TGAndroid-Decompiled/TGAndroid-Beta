package m2;
public final class q {
    public final long f14677a;
    public final long f14678b;

    public q(long j3, long j10) {
        this.f14677a = j3;
        this.f14678b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14677a == qVar.f14677a && this.f14678b == qVar.f14678b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14677a) * 31) + ((int) this.f14678b);
    }
}
