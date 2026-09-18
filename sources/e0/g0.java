package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7781a = new ArrayList();
    public int f7782b = 1;
    public ArrayList f7783c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7784f = 80;
    public String f7785g;
    public String h;

    public final void a(k kVar) {
        this.f7781a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7781a = new ArrayList(this.f7781a);
        g0Var.f7782b = this.f7782b;
        g0Var.f7783c = new ArrayList(this.f7783c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7784f = this.f7784f;
        g0Var.f7785g = this.f7785g;
        g0Var.h = this.h;
        return g0Var;
    }
}
