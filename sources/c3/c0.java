package c3;
public final class c0 {
    public static final c0 f6030c = new c0(0, 0);
    public final long f6031a;
    public final long f6032b;

    public c0(long j10, long j11) {
        this.f6031a = j10;
        this.f6032b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f6031a == c0Var.f6031a && this.f6032b == c0Var.f6032b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6031a) * 31) + ((int) this.f6032b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f6031a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.f6032b, "]");
    }
}
