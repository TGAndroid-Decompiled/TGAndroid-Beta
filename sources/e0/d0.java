package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10184a = new ArrayList();
    public int f10185b = 1;
    public ArrayList f10186c = new ArrayList();
    public int d = 8388613;
    public int f10187e = -1;
    public int f10188f = 80;
    public String f10189g;
    public String h;

    public final void a(h hVar) {
        this.f10184a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10184a = new ArrayList(this.f10184a);
        d0Var.f10185b = this.f10185b;
        d0Var.f10186c = new ArrayList(this.f10186c);
        d0Var.d = this.d;
        d0Var.f10187e = this.f10187e;
        d0Var.f10188f = this.f10188f;
        d0Var.f10189g = this.f10189g;
        d0Var.h = this.h;
        return d0Var;
    }
}
