package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f8090a = new ArrayList();
    public int f8091b = 1;
    public ArrayList f8092c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8093f = 80;
    public String f8094g;
    public String h;

    public final void a(h hVar) {
        this.f8090a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f8090a = new ArrayList(this.f8090a);
        d0Var.f8091b = this.f8091b;
        d0Var.f8092c = new ArrayList(this.f8092c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f8093f = this.f8093f;
        d0Var.f8094g = this.f8094g;
        d0Var.h = this.h;
        return d0Var;
    }
}
