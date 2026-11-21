package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10218a = new ArrayList();
    public int f10219b = 1;
    public ArrayList f10220c = new ArrayList();
    public int d = 8388613;
    public int f10221e = -1;
    public int f10222f = 80;
    public String f10223g;
    public String h;

    public final void a(h hVar) {
        this.f10218a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10218a = new ArrayList(this.f10218a);
        d0Var.f10219b = this.f10219b;
        d0Var.f10220c = new ArrayList(this.f10220c);
        d0Var.d = this.d;
        d0Var.f10221e = this.f10221e;
        d0Var.f10222f = this.f10222f;
        d0Var.f10223g = this.f10223g;
        d0Var.h = this.h;
        return d0Var;
    }
}
