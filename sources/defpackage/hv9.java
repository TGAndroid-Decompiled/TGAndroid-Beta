package defpackage;
public final class hv9 {
    public static final hv9 c = new hv9(0, 0);
    public final long a;
    public final long b;

    public hv9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hv9.class == obj.getClass()) {
            hv9 hv9Var = (hv9) obj;
            if (this.a == hv9Var.a && this.b == hv9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return ls6.p(sb, this.b, "]");
    }
}
