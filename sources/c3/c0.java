package c3;
public final class c0 {
    public static final c0 f4218c = new c0(0, 0);
    public final long f4219a;
    public final long f4220b;

    public c0(long j10, long j11) {
        this.f4219a = j10;
        this.f4220b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4219a == c0Var.f4219a && this.f4220b == c0Var.f4220b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4219a) * 31) + ((int) this.f4220b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4219a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.f4220b, "]");
    }
}
