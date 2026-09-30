package m2;
public final class q {
    public final long f14683a;
    public final long f14684b;

    public q(long j3, long j10) {
        this.f14683a = j3;
        this.f14684b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14683a == qVar.f14683a && this.f14684b == qVar.f14684b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14683a) * 31) + ((int) this.f14684b);
    }
}
