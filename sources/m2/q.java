package m2;
public final class q {
    public final long f16026a;
    public final long f16027b;

    public q(long j3, long j10) {
        this.f16026a = j3;
        this.f16027b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16026a == qVar.f16026a && this.f16027b == qVar.f16027b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16026a) * 31) + ((int) this.f16027b);
    }
}
