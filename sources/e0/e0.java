package e0;

import java.util.ArrayList;
public final class e0 {
    public ArrayList f8401a = new ArrayList();
    public int f8402b = 1;
    public ArrayList f8403c = new ArrayList();
    public int d = 8388613;
    public int f8404e = -1;
    public int f8405f = 80;
    public String f8406g;
    public String h;

    public final void a(i iVar) {
        this.f8401a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.f8401a = new ArrayList(this.f8401a);
        e0Var.f8402b = this.f8402b;
        e0Var.f8403c = new ArrayList(this.f8403c);
        e0Var.d = this.d;
        e0Var.f8404e = this.f8404e;
        e0Var.f8405f = this.f8405f;
        e0Var.f8406g = this.f8406g;
        e0Var.h = this.h;
        return e0Var;
    }
}
