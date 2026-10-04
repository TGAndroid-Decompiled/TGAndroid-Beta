package m2;
public final class q {
    public final long f16030a;
    public final long f16031b;

    public q(long j3, long j10) {
        this.f16030a = j3;
        this.f16031b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16030a == qVar.f16030a && this.f16031b == qVar.f16031b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16030a) * 31) + ((int) this.f16031b);
    }
}
