package m2;
public final class q {
    public final long f17983a;
    public final long f17984b;

    public q(long j10, long j11) {
        this.f17983a = j10;
        this.f17984b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f17983a == qVar.f17983a && this.f17984b == qVar.f17984b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17983a) * 31) + ((int) this.f17984b);
    }
}
