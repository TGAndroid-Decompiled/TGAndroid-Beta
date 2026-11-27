package defpackage;
public final class qg4 {
    public long a;
    public int b;

    public qg4(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qg4.class == obj.getClass()) {
            qg4 qg4Var = (qg4) obj;
            if (this.a == qg4Var.a && this.b == qg4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
