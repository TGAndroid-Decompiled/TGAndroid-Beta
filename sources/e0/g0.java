package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7776a = new ArrayList();
    public int f7777b = 1;
    public ArrayList f7778c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7779f = 80;
    public String f7780g;
    public String h;

    public final void a(k kVar) {
        this.f7776a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7776a = new ArrayList(this.f7776a);
        g0Var.f7777b = this.f7777b;
        g0Var.f7778c = new ArrayList(this.f7778c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7779f = this.f7779f;
        g0Var.f7780g = this.f7780g;
        g0Var.h = this.h;
        return g0Var;
    }
}
