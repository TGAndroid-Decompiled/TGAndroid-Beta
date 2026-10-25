package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f9522a = new ArrayList();
    public int f9523b = 1;
    public ArrayList f9524c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f9525f = 80;
    public String f9526g;
    public String h;

    public final void a(h hVar) {
        this.f9522a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f9522a = new ArrayList(this.f9522a);
        d0Var.f9523b = this.f9523b;
        d0Var.f9524c = new ArrayList(this.f9524c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f9525f = this.f9525f;
        d0Var.f9526g = this.f9526g;
        d0Var.h = this.h;
        return d0Var;
    }
}
