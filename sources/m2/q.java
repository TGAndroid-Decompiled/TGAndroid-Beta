package m2;
public final class q {
    public final long f14429a;
    public final long f14430b;

    public q(long j3, long j10) {
        this.f14429a = j3;
        this.f14430b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14429a == qVar.f14429a && this.f14430b == qVar.f14430b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14429a) * 31) + ((int) this.f14430b);
    }
}
