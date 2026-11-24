package defpackage;
public final class ux9 {
    public final long a;
    public final long b;

    public ux9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ux9.class == obj.getClass()) {
            ux9 ux9Var = (ux9) obj;
            if (this.a == ux9Var.a && this.b == ux9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
