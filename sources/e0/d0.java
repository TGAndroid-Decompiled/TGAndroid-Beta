package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10221a = new ArrayList();
    public int f10222b = 1;
    public ArrayList f10223c = new ArrayList();
    public int d = 8388613;
    public int f10224e = -1;
    public int f10225f = 80;
    public String f10226g;
    public String h;

    public final void a(h hVar) {
        this.f10221a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10221a = new ArrayList(this.f10221a);
        d0Var.f10222b = this.f10222b;
        d0Var.f10223c = new ArrayList(this.f10223c);
        d0Var.d = this.d;
        d0Var.f10224e = this.f10224e;
        d0Var.f10225f = this.f10225f;
        d0Var.f10226g = this.f10226g;
        d0Var.h = this.h;
        return d0Var;
    }
}
