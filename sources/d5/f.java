package d5;

import j3.t0;
public final class f implements Comparable {
    public final boolean f5337a;
    public final boolean f5338b;

    public f(t0 t0Var, int i10) {
        this.f5337a = (t0Var.d & 1) != 0;
        this.f5338b = p.f(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return q8.t.f46493a.c(this.f5338b, fVar.f5338b).c(this.f5337a, fVar.f5337a).e();
    }
}
