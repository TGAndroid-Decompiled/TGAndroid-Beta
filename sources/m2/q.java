package m2;
public final class q {
    public final long f14667a;
    public final long f14668b;

    public q(long j3, long j10) {
        this.f14667a = j3;
        this.f14668b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14667a == qVar.f14667a && this.f14668b == qVar.f14668b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14667a) * 31) + ((int) this.f14668b);
    }
}
