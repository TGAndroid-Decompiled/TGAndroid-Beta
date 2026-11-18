package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10192a = new ArrayList();
    public int f10193b = 1;
    public ArrayList f10194c = new ArrayList();
    public int d = 8388613;
    public int f10195e = -1;
    public int f10196f = 80;
    public String f10197g;
    public String h;

    public final void a(h hVar) {
        this.f10192a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10192a = new ArrayList(this.f10192a);
        d0Var.f10193b = this.f10193b;
        d0Var.f10194c = new ArrayList(this.f10194c);
        d0Var.d = this.d;
        d0Var.f10195e = this.f10195e;
        d0Var.f10196f = this.f10196f;
        d0Var.f10197g = this.f10197g;
        d0Var.h = this.h;
        return d0Var;
    }
}
