package m2;
public final class q {
    public final long f16462a;
    public final long f16463b;

    public q(long j10, long j11) {
        this.f16462a = j10;
        this.f16463b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16462a == qVar.f16462a && this.f16463b == qVar.f16463b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16462a) * 31) + ((int) this.f16463b);
    }
}
