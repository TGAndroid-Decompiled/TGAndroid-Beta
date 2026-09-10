package m2;
public final class q {
    public final long f13279a;
    public final long f13280b;

    public q(long j3, long j10) {
        this.f13279a = j3;
        this.f13280b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f13279a == qVar.f13279a && this.f13280b == qVar.f13280b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13279a) * 31) + ((int) this.f13280b);
    }
}
