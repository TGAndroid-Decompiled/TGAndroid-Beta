package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f8416a = new ArrayList();
    public int f8417b = 1;
    public ArrayList f8418c = new ArrayList();
    public int d = 8388613;
    public int f8419e = -1;
    public int f8420f = 80;
    public String f8421g;
    public String h;

    public final void a(k kVar) {
        this.f8416a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f8416a = new ArrayList(this.f8416a);
        g0Var.f8417b = this.f8417b;
        g0Var.f8418c = new ArrayList(this.f8418c);
        g0Var.d = this.d;
        g0Var.f8419e = this.f8419e;
        g0Var.f8420f = this.f8420f;
        g0Var.f8421g = this.f8421g;
        g0Var.h = this.h;
        return g0Var;
    }
}
