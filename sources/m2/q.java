package m2;
public final class q {
    public final long f17982a;
    public final long f17983b;

    public q(long j10, long j11) {
        this.f17982a = j10;
        this.f17983b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f17982a == qVar.f17982a && this.f17983b == qVar.f17983b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17982a) * 31) + ((int) this.f17983b);
    }
}
