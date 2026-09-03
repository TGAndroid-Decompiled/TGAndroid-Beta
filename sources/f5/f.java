package f5;

import j3.n0;
public final class f implements Comparable {
    public final boolean f6024a;
    public final boolean f6025b;

    public f(n0 n0Var, int i10) {
        this.f6024a = (n0Var.d & 1) != 0;
        this.f6025b = p.f(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return s8.p.f47158a.c(this.f6025b, fVar.f6025b).c(this.f6024a, fVar.f6024a).e();
    }
}
