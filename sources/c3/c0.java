package c3;
public final class c0 {
    public static final c0 f4255c = new c0(0, 0);
    public final long f4256a;
    public final long f4257b;

    public c0(long j3, long j10) {
        this.f4256a = j3;
        this.f4257b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4256a == c0Var.f4256a && this.f4257b == c0Var.f4257b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4256a) * 31) + ((int) this.f4257b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4256a);
        sb2.append(", position=");
        return a4.a.r(sb2, this.f4257b, "]");
    }
}
