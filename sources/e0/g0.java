package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7082a = new ArrayList();
    public int f7083b = 1;
    public ArrayList f7084c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7085f = 80;
    public String f7086g;
    public String h;

    public final void a(k kVar) {
        this.f7082a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7082a = new ArrayList(this.f7082a);
        g0Var.f7083b = this.f7083b;
        g0Var.f7084c = new ArrayList(this.f7084c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7085f = this.f7085f;
        g0Var.f7086g = this.f7086g;
        g0Var.h = this.h;
        return g0Var;
    }
}
