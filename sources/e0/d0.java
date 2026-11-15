package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f9874a = new ArrayList();
    public int f9875b = 1;
    public ArrayList f9876c = new ArrayList();
    public int d = 8388613;
    public int f9877e = -1;
    public int f9878f = 80;
    public String f9879g;
    public String h;

    public final void a(h hVar) {
        this.f9874a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f9874a = new ArrayList(this.f9874a);
        d0Var.f9875b = this.f9875b;
        d0Var.f9876c = new ArrayList(this.f9876c);
        d0Var.d = this.d;
        d0Var.f9877e = this.f9877e;
        d0Var.f9878f = this.f9878f;
        d0Var.f9879g = this.f9879g;
        d0Var.h = this.h;
        return d0Var;
    }
}
