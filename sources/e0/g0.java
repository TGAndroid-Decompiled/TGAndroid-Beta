package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f7766a = new ArrayList();
    public int f7767b = 1;
    public ArrayList f7768c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f7769f = 80;
    public String f7770g;
    public String h;

    public final void a(k kVar) {
        this.f7766a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f7766a = new ArrayList(this.f7766a);
        g0Var.f7767b = this.f7767b;
        g0Var.f7768c = new ArrayList(this.f7768c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f7769f = this.f7769f;
        g0Var.f7770g = this.f7770g;
        g0Var.h = this.h;
        return g0Var;
    }
}
