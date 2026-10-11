package m2;
public final class q {
    public final long f15990a;
    public final long f15991b;

    public q(long j3, long j10) {
        this.f15990a = j3;
        this.f15991b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15990a == qVar.f15990a && this.f15991b == qVar.f15991b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15990a) * 31) + ((int) this.f15991b);
    }
}
