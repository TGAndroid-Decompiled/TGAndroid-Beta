package m2;
public final class q {
    public final long f15965a;
    public final long f15966b;

    public q(long j3, long j10) {
        this.f15965a = j3;
        this.f15966b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15965a == qVar.f15965a && this.f15966b == qVar.f15966b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15965a) * 31) + ((int) this.f15966b);
    }
}
