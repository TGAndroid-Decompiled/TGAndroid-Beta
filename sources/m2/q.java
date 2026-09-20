package m2;
public final class q {
    public final long f14662a;
    public final long f14663b;

    public q(long j3, long j10) {
        this.f14662a = j3;
        this.f14663b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f14662a == qVar.f14662a && this.f14663b == qVar.f14663b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14662a) * 31) + ((int) this.f14663b);
    }
}
