package m2;
public final class q {
    public final long f16464a;
    public final long f16465b;

    public q(long j10, long j11) {
        this.f16464a = j10;
        this.f16465b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16464a == qVar.f16464a && this.f16465b == qVar.f16465b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16464a) * 31) + ((int) this.f16465b);
    }
}
