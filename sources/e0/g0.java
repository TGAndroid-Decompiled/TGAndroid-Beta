package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f4967a = new ArrayList();
    public int f4968b = 1;
    public ArrayList f4969c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f4970f = 80;
    public String f4971g;
    public String h;

    public final void a(k kVar) {
        this.f4967a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f4967a = new ArrayList(this.f4967a);
        g0Var.f4968b = this.f4968b;
        g0Var.f4969c = new ArrayList(this.f4969c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f4970f = this.f4970f;
        g0Var.f4971g = this.f4971g;
        g0Var.h = this.h;
        return g0Var;
    }
}
