package e3;
public final class c0 {
    public static final c0 f9436c = new c0(0, 0);
    public final long f9437a;
    public final long f9438b;

    public c0(long j10, long j11) {
        this.f9437a = j10;
        this.f9438b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f9437a == c0Var.f9437a && this.f9438b == c0Var.f9438b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9437a) * 31) + ((int) this.f9438b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f9437a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.f9438b, "]");
    }
}
