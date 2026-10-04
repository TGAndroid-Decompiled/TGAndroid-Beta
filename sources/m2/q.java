package m2;
public final class q {
    public final long f16025a;
    public final long f16026b;

    public q(long j3, long j10) {
        this.f16025a = j3;
        this.f16026b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16025a == qVar.f16025a && this.f16026b == qVar.f16026b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16025a) * 31) + ((int) this.f16026b);
    }
}
