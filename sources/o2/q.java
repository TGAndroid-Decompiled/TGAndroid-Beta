package o2;
public final class q {
    public final long f20566a;
    public final long f20567b;

    public q(long j10, long j11) {
        this.f20566a = j10;
        this.f20567b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f20566a == qVar.f20566a && this.f20567b == qVar.f20567b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f20566a) * 31) + ((int) this.f20567b);
    }
}
