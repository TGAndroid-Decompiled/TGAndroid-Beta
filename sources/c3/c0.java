package c3;
public final class c0 {
    public static final c0 f3731c = new c0(0, 0);
    public final long f3732a;
    public final long f3733b;

    public c0(long j3, long j10) {
        this.f3732a = j3;
        this.f3733b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f3732a == c0Var.f3732a && this.f3733b == c0Var.f3733b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3732a) * 31) + ((int) this.f3733b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f3732a);
        sb2.append(", position=");
        return a4.a.s(sb2, this.f3733b, "]");
    }
}
