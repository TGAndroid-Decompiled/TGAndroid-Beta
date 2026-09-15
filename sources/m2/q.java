package m2;
public final class q {
    public final long f14441a;
    public final long f14442b;

    public q(long j3, long j10) {
        this.f14441a = j3;
        this.f14442b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14441a == qVar.f14441a && this.f14442b == qVar.f14442b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14441a) * 31) + ((int) this.f14442b);
    }
}
