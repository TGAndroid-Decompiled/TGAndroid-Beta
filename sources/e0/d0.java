package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10043a = new ArrayList();
    public int f10044b = 1;
    public ArrayList f10045c = new ArrayList();
    public int d = 8388613;
    public int f10046e = -1;
    public int f10047f = 80;
    public String f10048g;
    public String h;

    public final void a(h hVar) {
        this.f10043a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10043a = new ArrayList(this.f10043a);
        d0Var.f10044b = this.f10044b;
        d0Var.f10045c = new ArrayList(this.f10045c);
        d0Var.d = this.d;
        d0Var.f10046e = this.f10046e;
        d0Var.f10047f = this.f10047f;
        d0Var.f10048g = this.f10048g;
        d0Var.h = this.h;
        return d0Var;
    }
}
