package m2;
public final class q {
    public final long f12678a;
    public final long f12679b;

    public q(long j10, long j11) {
        this.f12678a = j10;
        this.f12679b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f12678a == qVar.f12678a && this.f12679b == qVar.f12679b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12678a) * 31) + ((int) this.f12679b);
    }
}
