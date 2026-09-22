package m2;
public final class q {
    public final long f14439a;
    public final long f14440b;

    public q(long j3, long j10) {
        this.f14439a = j3;
        this.f14440b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14439a == qVar.f14439a && this.f14440b == qVar.f14440b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14439a) * 31) + ((int) this.f14440b);
    }
}
