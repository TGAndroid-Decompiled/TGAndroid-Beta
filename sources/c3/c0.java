package c3;
public final class c0 {
    public static final c0 f3736c = new c0(0, 0);
    public final long f3737a;
    public final long f3738b;

    public c0(long j3, long j10) {
        this.f3737a = j3;
        this.f3738b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f3737a == c0Var.f3737a && this.f3738b == c0Var.f3738b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3737a) * 31) + ((int) this.f3738b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f3737a);
        sb2.append(", position=");
        return a4.a.s(sb2, this.f3738b, "]");
    }
}
