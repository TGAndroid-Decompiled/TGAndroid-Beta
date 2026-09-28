package m2;
public final class q {
    public final long f14682a;
    public final long f14683b;

    public q(long j3, long j10) {
        this.f14682a = j3;
        this.f14683b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14682a == qVar.f14682a && this.f14683b == qVar.f14683b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14682a) * 31) + ((int) this.f14683b);
    }
}
