package defpackage;
public final class bz9 {
    public static final bz9 c = new bz9(0, 0);
    public final long a;
    public final long b;

    public bz9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bz9.class == obj.getClass()) {
            bz9 bz9Var = (bz9) obj;
            if (this.a == bz9Var.a && this.b == bz9Var.b) {
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
        return qu6.p(sb, this.b, "]");
    }
}
