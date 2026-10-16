package m2;
public final class q {
    public final long f15104a;
    public final long f15105b;

    public q(long j10, long j11) {
        this.f15104a = j10;
        this.f15105b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15104a == qVar.f15104a && this.f15105b == qVar.f15105b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15104a) * 31) + ((int) this.f15105b);
    }
}
