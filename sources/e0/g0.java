package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f8645a = new ArrayList();
    public int f8646b = 1;
    public ArrayList f8647c = new ArrayList();
    public int d = 8388613;
    public int f8648e = -1;
    public int f8649f = 80;
    public String f8650g;
    public String h;

    public final void a(k kVar) {
        this.f8645a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f8645a = new ArrayList(this.f8645a);
        g0Var.f8646b = this.f8646b;
        g0Var.f8647c = new ArrayList(this.f8647c);
        g0Var.d = this.d;
        g0Var.f8648e = this.f8648e;
        g0Var.f8649f = this.f8649f;
        g0Var.f8650g = this.f8650g;
        g0Var.h = this.h;
        return g0Var;
    }
}
