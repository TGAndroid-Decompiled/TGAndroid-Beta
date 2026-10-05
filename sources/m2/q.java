package m2;
public final class q {
    public final long f16035a;
    public final long f16036b;

    public q(long j3, long j10) {
        this.f16035a = j3;
        this.f16036b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16035a == qVar.f16035a && this.f16036b == qVar.f16036b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16035a) * 31) + ((int) this.f16036b);
    }
}
