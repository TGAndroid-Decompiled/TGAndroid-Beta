package defpackage;
public final class ga0 {
    public final long a;
    public final ta0 b;
    public final r90 c;

    public ga0(long j, ta0 ta0Var, r90 r90Var) {
        this.a = j;
        this.b = ta0Var;
        this.c = r90Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ga0) {
                ga0 ga0Var = (ga0) obj;
                if (this.a == ga0Var.a && this.b.equals(ga0Var.b) && this.c.equals(ga0Var.c)) {
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
