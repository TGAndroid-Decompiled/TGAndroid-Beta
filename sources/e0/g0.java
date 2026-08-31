package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f4789a = new ArrayList();
    public int f4790b = 1;
    public ArrayList f4791c = new ArrayList();
    public int d = 8388613;
    public int f4792e = -1;
    public int f4793f = 80;
    public String f4794g;
    public String h;

    public final void a(k kVar) {
        this.f4789a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f4789a = new ArrayList(this.f4789a);
        g0Var.f4790b = this.f4790b;
        g0Var.f4791c = new ArrayList(this.f4791c);
        g0Var.d = this.d;
        g0Var.f4792e = this.f4792e;
        g0Var.f4793f = this.f4793f;
        g0Var.f4794g = this.f4794g;
        g0Var.h = this.h;
        return g0Var;
    }
}
