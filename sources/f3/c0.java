package f3;

import a8.p0;
public final class c0 {
    public static final c0 f10807c = new c0(0, 0);
    public final long f10808a;
    public final long f10809b;

    public c0(long j3, long j10) {
        this.f10808a = j3;
        this.f10809b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f10808a == c0Var.f10808a && this.f10809b == c0Var.f10809b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10808a) * 31) + ((int) this.f10809b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f10808a);
        sb2.append(", position=");
        return p0.r(sb2, this.f10809b, "]");
    }
}
