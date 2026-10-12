package m2;
public final class q {
    public final long f15714a;
    public final long f15715b;

    public q(long j3, long j10) {
        this.f15714a = j3;
        this.f15715b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15714a == qVar.f15714a && this.f15715b == qVar.f15715b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15714a) * 31) + ((int) this.f15715b);
    }
}
