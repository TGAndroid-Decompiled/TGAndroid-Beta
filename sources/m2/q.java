package m2;
public final class q {
    public final long f14709a;
    public final long f14710b;

    public q(long j3, long j10) {
        this.f14709a = j3;
        this.f14710b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14709a == qVar.f14709a && this.f14710b == qVar.f14710b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14709a) * 31) + ((int) this.f14710b);
    }
}
