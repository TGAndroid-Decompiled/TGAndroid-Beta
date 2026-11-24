package defpackage;

import java.util.List;
public final class tw6 {
    public final mo5 a;
    public final int b;
    public final long c;

    public tw6(List list, int i, long j) {
        this.a = mo5.q(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw6)) {
            return false;
        }
        tw6 tw6Var = (tw6) obj;
        if (this.a.equals(tw6Var.a) && this.b == tw6Var.b && this.c == tw6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return cqe.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
