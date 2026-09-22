package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7779a = new ArrayList();
    public int f7780b = 1;
    public ArrayList f7781c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7782f = 80;
    public String f7783g;
    public String h;

    public final void a(k kVar) {
        this.f7779a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7779a = new ArrayList(this.f7779a);
        g0Var.f7780b = this.f7780b;
        g0Var.f7781c = new ArrayList(this.f7781c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7782f = this.f7782f;
        g0Var.f7783g = this.f7783g;
        g0Var.h = this.h;
        return g0Var;
    }
}
