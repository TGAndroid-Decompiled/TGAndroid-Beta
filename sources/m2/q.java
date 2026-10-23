package m2;
public final class q {
    public final long f16526a;
    public final long f16527b;

    public q(long j10, long j11) {
        this.f16526a = j10;
        this.f16527b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16526a == qVar.f16526a && this.f16527b == qVar.f16527b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16526a) * 31) + ((int) this.f16527b);
    }
}
