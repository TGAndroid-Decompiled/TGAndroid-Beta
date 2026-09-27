package c3;
public final class c0 {
    public static final c0 f3733c = new c0(0, 0);
    public final long f3734a;
    public final long f3735b;

    public c0(long j3, long j10) {
        this.f3734a = j3;
        this.f3735b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f3734a == c0Var.f3734a && this.f3735b == c0Var.f3735b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3734a) * 31) + ((int) this.f3735b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f3734a);
        sb2.append(", position=");
        return a4.a.r(sb2, this.f3735b, "]");
    }
}
