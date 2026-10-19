package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f8087a = new ArrayList();
    public int f8088b = 1;
    public ArrayList f8089c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8090f = 80;
    public String f8091g;
    public String h;

    public final void a(h hVar) {
        this.f8087a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f8087a = new ArrayList(this.f8087a);
        d0Var.f8088b = this.f8088b;
        d0Var.f8089c = new ArrayList(this.f8089c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f8090f = this.f8090f;
        d0Var.f8091g = this.f8091g;
        d0Var.h = this.h;
        return d0Var;
    }
}
