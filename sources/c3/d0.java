package c3;
public final class d0 {
    public static final d0 f4606c = new d0(0, 0);
    public final long f4607a;
    public final long f4608b;

    public d0(long j10, long j11) {
        this.f4607a = j10;
        this.f4608b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f4607a == d0Var.f4607a && this.f4608b == d0Var.f4608b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4607a) * 31) + ((int) this.f4608b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4607a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.f4608b, "]");
    }
}
