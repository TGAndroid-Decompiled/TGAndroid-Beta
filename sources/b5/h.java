package b5;

import h3.t0;
public final class h implements Comparable {
    public final boolean f1463a;
    public final boolean f1464b;

    public h(t0 t0Var, int i9) {
        this.f1463a = (t0Var.d & 1) != 0;
        this.f1464b = r.f(i9, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return o8.t.f19087a.c(this.f1464b, hVar.f1464b).c(this.f1463a, hVar.f1463a).e();
    }
}
