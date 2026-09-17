package c3;
public final class c0 {
    public static final c0 f4228c = new c0(0, 0);
    public final long f4229a;
    public final long f4230b;

    public c0(long j3, long j10) {
        this.f4229a = j3;
        this.f4230b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4229a == c0Var.f4229a && this.f4230b == c0Var.f4230b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4229a) * 31) + ((int) this.f4230b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4229a);
        sb2.append(", position=");
        return a4.a.r(sb2, this.f4230b, "]");
    }
}
