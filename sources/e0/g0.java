package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f4699a = new ArrayList();
    public int f4700b = 1;
    public ArrayList f4701c = new ArrayList();
    public int d = 8388613;
    public int f4702e = -1;
    public int f4703f = 80;
    public String f4704g;
    public String h;

    public final void a(k kVar) {
        this.f4699a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f4699a = new ArrayList(this.f4699a);
        g0Var.f4700b = this.f4700b;
        g0Var.f4701c = new ArrayList(this.f4701c);
        g0Var.d = this.d;
        g0Var.f4702e = this.f4702e;
        g0Var.f4703f = this.f4703f;
        g0Var.f4704g = this.f4704g;
        g0Var.h = this.h;
        return g0Var;
    }
}
