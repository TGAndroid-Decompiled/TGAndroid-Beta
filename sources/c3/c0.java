package c3;
public final class c0 {
    public static final c0 f4153c = new c0(0, 0);
    public final long f4154a;
    public final long f4155b;

    public c0(long j3, long j10) {
        this.f4154a = j3;
        this.f4155b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4154a == c0Var.f4154a && this.f4155b == c0Var.f4155b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4154a) * 31) + ((int) this.f4155b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4154a);
        sb2.append(", position=");
        return a4.a.r(sb2, this.f4155b, "]");
    }
}
