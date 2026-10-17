package m2;
public final class q {
    public final long f16457a;
    public final long f16458b;

    public q(long j10, long j11) {
        this.f16457a = j10;
        this.f16458b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16457a == qVar.f16457a && this.f16458b == qVar.f16458b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16457a) * 31) + ((int) this.f16458b);
    }
}
