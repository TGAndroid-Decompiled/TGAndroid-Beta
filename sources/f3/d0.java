package f3;

import a8.p0;
public final class d0 {
    public static final d0 f11015c = new d0(0, 0);
    public final long f11016a;
    public final long f11017b;

    public d0(long j3, long j10) {
        this.f11016a = j3;
        this.f11017b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f11016a == d0Var.f11016a && this.f11017b == d0Var.f11017b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11016a) * 31) + ((int) this.f11017b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f11016a);
        sb2.append(", position=");
        return p0.r(sb2, this.f11017b, "]");
    }
}
