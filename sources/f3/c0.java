package f3;

import a8.p0;
public final class c0 {
    public static final c0 f11155c = new c0(0, 0);
    public final long f11156a;
    public final long f11157b;

    public c0(long j3, long j10) {
        this.f11156a = j3;
        this.f11157b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f11156a == c0Var.f11156a && this.f11157b == c0Var.f11157b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11156a) * 31) + ((int) this.f11157b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f11156a);
        sb2.append(", position=");
        return p0.r(sb2, this.f11157b, "]");
    }
}
