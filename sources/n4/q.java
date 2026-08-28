package n4;
public final class q {
    public final long f18443a;
    public final long f18444b;

    public q(long j10, long j11) {
        this.f18443a = j10;
        this.f18444b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f18443a == qVar.f18443a && this.f18444b == qVar.f18444b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18443a) * 31) + ((int) this.f18444b);
    }
}
