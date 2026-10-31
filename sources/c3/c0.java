package c3;
public final class c0 {
    public static final c0 f3623c = new c0(0, 0);
    public final long f3624a;
    public final long f3625b;

    public c0(long j10, long j11) {
        this.f3624a = j10;
        this.f3625b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f3624a == c0Var.f3624a && this.f3625b == c0Var.f3625b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3624a) * 31) + ((int) this.f3625b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f3624a);
        sb2.append(", position=");
        return a1.g.q(sb2, this.f3625b, "]");
    }
}
