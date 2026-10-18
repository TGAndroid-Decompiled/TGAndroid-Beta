package c3;
public final class d0 {
    public static final d0 f4607c = new d0(0, 0);
    public final long f4608a;
    public final long f4609b;

    public d0(long j10, long j11) {
        this.f4608a = j10;
        this.f4609b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f4608a == d0Var.f4608a && this.f4609b == d0Var.f4609b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4608a) * 31) + ((int) this.f4609b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4608a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.f4609b, "]");
    }
}
