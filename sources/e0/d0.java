package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f8088a = new ArrayList();
    public int f8089b = 1;
    public ArrayList f8090c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8091f = 80;
    public String f8092g;
    public String h;

    public final void a(h hVar) {
        this.f8088a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f8088a = new ArrayList(this.f8088a);
        d0Var.f8089b = this.f8089b;
        d0Var.f8090c = new ArrayList(this.f8090c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f8091f = this.f8091f;
        d0Var.f8092g = this.f8092g;
        d0Var.h = this.h;
        return d0Var;
    }
}
