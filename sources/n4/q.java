package n4;

public final class q {

    public final long f18270a;

    public final long f18271b;

    public q(long j10, long j11) {
        this.f18270a = j10;
        this.f18271b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f18270a == qVar.f18270a && this.f18271b == qVar.f18271b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18270a) * 31) + ((int) this.f18271b);
    }
}
