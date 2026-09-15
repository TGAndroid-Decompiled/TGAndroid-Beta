package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7777a = new ArrayList();
    public int f7778b = 1;
    public ArrayList f7779c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7780f = 80;
    public String f7781g;
    public String h;

    public final void a(k kVar) {
        this.f7777a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7777a = new ArrayList(this.f7777a);
        g0Var.f7778b = this.f7778b;
        g0Var.f7779c = new ArrayList(this.f7779c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7780f = this.f7780f;
        g0Var.f7781g = this.f7781g;
        g0Var.h = this.h;
        return g0Var;
    }
}
