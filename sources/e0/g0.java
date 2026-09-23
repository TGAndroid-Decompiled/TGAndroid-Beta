package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7765a = new ArrayList();
    public int f7766b = 1;
    public ArrayList f7767c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7768f = 80;
    public String f7769g;
    public String h;

    public final void a(k kVar) {
        this.f7765a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7765a = new ArrayList(this.f7765a);
        g0Var.f7766b = this.f7766b;
        g0Var.f7767c = new ArrayList(this.f7767c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7768f = this.f7768f;
        g0Var.f7769g = this.f7769g;
        g0Var.h = this.h;
        return g0Var;
    }
}
