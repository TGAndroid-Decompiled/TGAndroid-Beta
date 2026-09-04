package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f8617a = new ArrayList();
    public int f8618b = 1;
    public ArrayList f8619c = new ArrayList();
    public int d = 8388613;
    public int f8620e = -1;
    public int f8621f = 80;
    public String f8622g;
    public String h;

    public final void a(k kVar) {
        this.f8617a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f8617a = new ArrayList(this.f8617a);
        g0Var.f8618b = this.f8618b;
        g0Var.f8619c = new ArrayList(this.f8619c);
        g0Var.d = this.d;
        g0Var.f8620e = this.f8620e;
        g0Var.f8621f = this.f8621f;
        g0Var.f8622g = this.f8622g;
        g0Var.h = this.h;
        return g0Var;
    }
}
