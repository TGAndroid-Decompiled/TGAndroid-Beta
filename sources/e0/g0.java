package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7764a = new ArrayList();
    public int f7765b = 1;
    public ArrayList f7766c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7767f = 80;
    public String f7768g;
    public String h;

    public final void a(k kVar) {
        this.f7764a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7764a = new ArrayList(this.f7764a);
        g0Var.f7765b = this.f7765b;
        g0Var.f7766c = new ArrayList(this.f7766c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7767f = this.f7767f;
        g0Var.f7768g = this.f7768g;
        g0Var.h = this.h;
        return g0Var;
    }
}
