package m2;
public final class q {
    public final long f12679a;
    public final long f12680b;

    public q(long j10, long j11) {
        this.f12679a = j10;
        this.f12680b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f12679a == qVar.f12679a && this.f12680b == qVar.f12680b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12679a) * 31) + ((int) this.f12680b);
    }
}
