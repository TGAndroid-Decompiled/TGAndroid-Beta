package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7782a = new ArrayList();
    public int f7783b = 1;
    public ArrayList f7784c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7785f = 80;
    public String f7786g;
    public String h;

    public final void a(k kVar) {
        this.f7782a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7782a = new ArrayList(this.f7782a);
        g0Var.f7783b = this.f7783b;
        g0Var.f7784c = new ArrayList(this.f7784c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7785f = this.f7785f;
        g0Var.f7786g = this.f7786g;
        g0Var.h = this.h;
        return g0Var;
    }
}
