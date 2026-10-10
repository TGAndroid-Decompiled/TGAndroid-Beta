package m2;
public final class q {
    public final long f15969a;
    public final long f15970b;

    public q(long j3, long j10) {
        this.f15969a = j3;
        this.f15970b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f15969a == qVar.f15969a && this.f15970b == qVar.f15970b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15969a) * 31) + ((int) this.f15970b);
    }
}
