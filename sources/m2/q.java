package m2;
public final class q {
    public final long f14626a;
    public final long f14627b;

    public q(long j3, long j10) {
        this.f14626a = j3;
        this.f14627b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14626a == qVar.f14626a && this.f14627b == qVar.f14627b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14626a) * 31) + ((int) this.f14627b);
    }
}
