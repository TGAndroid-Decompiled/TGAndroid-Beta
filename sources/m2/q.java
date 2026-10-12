package m2;
public final class q {
    public final long f15369a;
    public final long f15370b;

    public q(long j10, long j11) {
        this.f15369a = j10;
        this.f15370b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15369a == qVar.f15369a && this.f15370b == qVar.f15370b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15369a) * 31) + ((int) this.f15370b);
    }
}
