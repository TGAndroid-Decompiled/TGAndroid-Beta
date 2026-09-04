package m2;
public final class q {
    public final long f15810a;
    public final long f15811b;

    public q(long j3, long j10) {
        this.f15810a = j3;
        this.f15811b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15810a == qVar.f15810a && this.f15811b == qVar.f15811b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15810a) * 31) + ((int) this.f15811b);
    }
}
