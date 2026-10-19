package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f8089a = new ArrayList();
    public int f8090b = 1;
    public ArrayList f8091c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8092f = 80;
    public String f8093g;
    public String h;

    public final void a(h hVar) {
        this.f8089a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f8089a = new ArrayList(this.f8089a);
        d0Var.f8090b = this.f8090b;
        d0Var.f8091c = new ArrayList(this.f8091c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f8092f = this.f8092f;
        d0Var.f8093g = this.f8093g;
        d0Var.h = this.h;
        return d0Var;
    }
}
