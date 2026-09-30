package m2;
public final class q {
    public final long f14698a;
    public final long f14699b;

    public q(long j3, long j10) {
        this.f14698a = j3;
        this.f14699b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14698a == qVar.f14698a && this.f14699b == qVar.f14699b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14698a) * 31) + ((int) this.f14699b);
    }
}
