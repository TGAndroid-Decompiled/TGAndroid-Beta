package c3;
public final class f0 {
    public static final f0 f4620c = new f0(0, 0);
    public final long f4621a;
    public final long f4622b;

    public f0(long j10, long j11) {
        this.f4621a = j10;
        this.f4622b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.f4621a == f0Var.f4621a && this.f4622b == f0Var.f4622b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4621a) * 31) + ((int) this.f4622b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4621a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.f4622b, "]");
    }
}
