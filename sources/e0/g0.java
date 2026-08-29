package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f5669a = new ArrayList();
    public int f5670b = 1;
    public ArrayList f5671c = new ArrayList();
    public int d = 8388613;
    public int f5672e = -1;
    public int f5673f = 80;
    public String f5674g;
    public String h;

    public final void a(k kVar) {
        this.f5669a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f5669a = new ArrayList(this.f5669a);
        g0Var.f5670b = this.f5670b;
        g0Var.f5671c = new ArrayList(this.f5671c);
        g0Var.d = this.d;
        g0Var.f5672e = this.f5672e;
        g0Var.f5673f = this.f5673f;
        g0Var.f5674g = this.f5674g;
        g0Var.h = this.h;
        return g0Var;
    }
}
