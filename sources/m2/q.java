package m2;
public final class q {
    public final long f15715a;
    public final long f15716b;

    public q(long j3, long j10) {
        this.f15715a = j3;
        this.f15716b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15715a == qVar.f15715a && this.f15716b == qVar.f15716b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15715a) * 31) + ((int) this.f15716b);
    }
}
