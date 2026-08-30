package f5;

import j3.n0;
public final class f implements Comparable {
    public final boolean f5924a;
    public final boolean f5925b;

    public f(n0 n0Var, int i10) {
        this.f5924a = (n0Var.d & 1) != 0;
        this.f5925b = p.f(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return s8.p.f44142a.c(this.f5925b, fVar.f5925b).c(this.f5924a, fVar.f5924a).e();
    }
}
