package f3;

import a8.p0;
public final class d0 {
    public static final d0 f11010c = new d0(0, 0);
    public final long f11011a;
    public final long f11012b;

    public d0(long j3, long j10) {
        this.f11011a = j3;
        this.f11012b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f11011a == d0Var.f11011a && this.f11012b == d0Var.f11012b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11011a) * 31) + ((int) this.f11012b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f11011a);
        sb2.append(", position=");
        return p0.r(sb2, this.f11012b, "]");
    }
}
