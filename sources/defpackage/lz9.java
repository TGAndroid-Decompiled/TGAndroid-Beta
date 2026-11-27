package defpackage;
public final class lz9 {
    public final long a;
    public final long b;

    public lz9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lz9.class == obj.getClass()) {
            lz9 lz9Var = (lz9) obj;
            if (this.a == lz9Var.a && this.b == lz9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
