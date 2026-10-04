package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f8417a = new ArrayList();
    public int f8418b = 1;
    public ArrayList f8419c = new ArrayList();
    public int d = 8388613;
    public int f8420e = -1;
    public int f8421f = 80;
    public String f8422g;
    public String h;

    public final void a(k kVar) {
        this.f8417a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f8417a = new ArrayList(this.f8417a);
        g0Var.f8418b = this.f8418b;
        g0Var.f8419c = new ArrayList(this.f8419c);
        g0Var.d = this.d;
        g0Var.f8420e = this.f8420e;
        g0Var.f8421f = this.f8421f;
        g0Var.f8422g = this.f8422g;
        g0Var.h = this.h;
        return g0Var;
    }
}
