package defpackage;
public final class ea0 {
    public final long a;
    public final ra0 b;
    public final p90 c;

    public ea0(long j, ra0 ra0Var, p90 p90Var) {
        this.a = j;
        this.b = ra0Var;
        this.c = p90Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ea0) {
                ea0 ea0Var = (ea0) obj;
                if (this.a == ea0Var.a && this.b.equals(ea0Var.b) && this.c.equals(ea0Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
