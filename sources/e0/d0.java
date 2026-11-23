package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10182a = new ArrayList();
    public int f10183b = 1;
    public ArrayList f10184c = new ArrayList();
    public int d = 8388613;
    public int f10185e = -1;
    public int f10186f = 80;
    public String f10187g;
    public String h;

    public final void a(h hVar) {
        this.f10182a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10182a = new ArrayList(this.f10182a);
        d0Var.f10183b = this.f10183b;
        d0Var.f10184c = new ArrayList(this.f10184c);
        d0Var.d = this.d;
        d0Var.f10185e = this.f10185e;
        d0Var.f10186f = this.f10186f;
        d0Var.f10187g = this.f10187g;
        d0Var.h = this.h;
        return d0Var;
    }
}
