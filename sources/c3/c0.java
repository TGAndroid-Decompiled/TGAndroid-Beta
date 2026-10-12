package c3;
public final class c0 {
    public static final c0 f4082c = new c0(0, 0);
    public final long f4083a;
    public final long f4084b;

    public c0(long j3, long j10) {
        this.f4083a = j3;
        this.f4084b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4083a == c0Var.f4083a && this.f4084b == c0Var.f4084b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4083a) * 31) + ((int) this.f4084b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4083a);
        sb2.append(", position=");
        return a1.g.s(sb2, this.f4084b, "]");
    }
}
