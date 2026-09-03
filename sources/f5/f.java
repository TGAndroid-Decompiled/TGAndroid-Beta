package f5;

import j3.n0;
public final class f implements Comparable {
    public final boolean f5913a;
    public final boolean f5914b;

    public f(n0 n0Var, int i10) {
        this.f5913a = (n0Var.d & 1) != 0;
        this.f5914b = p.f(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return s8.p.f44207a.c(this.f5914b, fVar.f5914b).c(this.f5913a, fVar.f5913a).e();
    }
}
