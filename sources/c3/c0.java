package c3;
public final class c0 {
    public static final c0 f3739c = new c0(0, 0);
    public final long f3740a;
    public final long f3741b;

    public c0(long j3, long j10) {
        this.f3740a = j3;
        this.f3741b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f3740a == c0Var.f3740a && this.f3741b == c0Var.f3741b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3740a) * 31) + ((int) this.f3741b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f3740a);
        sb2.append(", position=");
        return a4.a.r(sb2, this.f3741b, "]");
    }
}
