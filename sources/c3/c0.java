package c3;
public final class c0 {
    public static final c0 f4034c = new c0(0, 0);
    public final long f4035a;
    public final long f4036b;

    public c0(long j3, long j10) {
        this.f4035a = j3;
        this.f4036b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4035a == c0Var.f4035a && this.f4036b == c0Var.f4036b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4035a) * 31) + ((int) this.f4036b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4035a);
        sb2.append(", position=");
        return a4.a.s(sb2, this.f4036b, "]");
    }
}
