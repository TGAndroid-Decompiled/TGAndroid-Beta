package defpackage;

import java.util.List;
public final class tu6 {
    public final mm5 a;
    public final int b;
    public final long c;

    public tu6(List list, int i, long j) {
        this.a = mm5.q(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu6)) {
            return false;
        }
        tu6 tu6Var = (tu6) obj;
        if (this.a.equals(tu6Var.a) && this.b == tu6Var.b && this.c == tu6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return zne.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
