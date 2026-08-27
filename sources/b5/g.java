package b5;

import h3.t0;

public final class g implements Comparable {

    public final boolean f1948a;

    public final boolean f1949b;

    public g(t0 t0Var, int i10) {
        this.f1948a = (t0Var.d & 1) != 0;
        this.f1949b = q.f(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return p8.t.f45586a.c(this.f1949b, gVar.f1949b).c(this.f1948a, gVar.f1948a).e();
    }
}
