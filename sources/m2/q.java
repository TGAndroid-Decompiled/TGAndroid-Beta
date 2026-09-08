package m2;
public final class q {
    public final long f15837a;
    public final long f15838b;

    public q(long j3, long j10) {
        this.f15837a = j3;
        this.f15838b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15837a == qVar.f15837a && this.f15838b == qVar.f15838b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15837a) * 31) + ((int) this.f15838b);
    }
}
