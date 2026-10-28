package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f9521a = new ArrayList();
    public int f9522b = 1;
    public ArrayList f9523c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f9524f = 80;
    public String f9525g;
    public String h;

    public final void a(h hVar) {
        this.f9521a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f9521a = new ArrayList(this.f9521a);
        d0Var.f9522b = this.f9522b;
        d0Var.f9523c = new ArrayList(this.f9523c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f9524f = this.f9524f;
        d0Var.f9525g = this.f9525g;
        d0Var.h = this.h;
        return d0Var;
    }
}
