package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f8094a = new ArrayList();
    public int f8095b = 1;
    public ArrayList f8096c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8097f = 80;
    public String f8098g;
    public String h;

    public final void a(h hVar) {
        this.f8094a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f8094a = new ArrayList(this.f8094a);
        d0Var.f8095b = this.f8095b;
        d0Var.f8096c = new ArrayList(this.f8096c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f8097f = this.f8097f;
        d0Var.f8098g = this.f8098g;
        d0Var.h = this.h;
        return d0Var;
    }
}
