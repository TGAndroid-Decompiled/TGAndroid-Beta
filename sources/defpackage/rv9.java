package defpackage;
public final class rv9 {
    public final long a;
    public final long b;

    public rv9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rv9.class == obj.getClass()) {
            rv9 rv9Var = (rv9) obj;
            if (this.a == rv9Var.a && this.b == rv9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
