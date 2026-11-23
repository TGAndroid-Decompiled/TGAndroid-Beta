package f3;

import a8.p0;
public final class c0 {
    public static final c0 f11121c = new c0(0, 0);
    public final long f11122a;
    public final long f11123b;

    public c0(long j3, long j10) {
        this.f11122a = j3;
        this.f11123b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f11122a == c0Var.f11122a && this.f11123b == c0Var.f11123b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11122a) * 31) + ((int) this.f11123b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f11122a);
        sb2.append(", position=");
        return p0.r(sb2, this.f11123b, "]");
    }
}
