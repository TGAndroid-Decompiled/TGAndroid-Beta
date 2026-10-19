package m2;
public final class q {
    public final long f16465a;
    public final long f16466b;

    public q(long j10, long j11) {
        this.f16465a = j10;
        this.f16466b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16465a == qVar.f16465a && this.f16466b == qVar.f16466b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16465a) * 31) + ((int) this.f16466b);
    }
}
