package c3;
public final class c0 {
    public static final c0 f4033c = new c0(0, 0);
    public final long f4034a;
    public final long f4035b;

    public c0(long j3, long j10) {
        this.f4034a = j3;
        this.f4035b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4034a == c0Var.f4034a && this.f4035b == c0Var.f4035b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4034a) * 31) + ((int) this.f4035b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4034a);
        sb2.append(", position=");
        return a4.a.r(sb2, this.f4035b, "]");
    }
}
