package defpackage;
public final class se4 {
    public long a;
    public int b;

    public se4(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && se4.class == obj.getClass()) {
            se4 se4Var = (se4) obj;
            if (this.a == se4Var.a && this.b == se4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
