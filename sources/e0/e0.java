package e0;

import java.util.ArrayList;
public final class e0 {
    public ArrayList f8403a = new ArrayList();
    public int f8404b = 1;
    public ArrayList f8405c = new ArrayList();
    public int d = 8388613;
    public int f8406e = -1;
    public int f8407f = 80;
    public String f8408g;
    public String h;

    public final void a(i iVar) {
        this.f8403a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.f8403a = new ArrayList(this.f8403a);
        e0Var.f8404b = this.f8404b;
        e0Var.f8405c = new ArrayList(this.f8405c);
        e0Var.d = this.d;
        e0Var.f8406e = this.f8406e;
        e0Var.f8407f = this.f8407f;
        e0Var.f8408g = this.f8408g;
        e0Var.h = this.h;
        return e0Var;
    }
}
