package e0;

import java.util.ArrayList;
public final class e0 {
    public ArrayList f6008a = new ArrayList();
    public int f6009b = 1;
    public ArrayList f6010c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f6011f = 80;
    public String f6012g;
    public String h;

    public final void a(i iVar) {
        this.f6008a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.f6008a = new ArrayList(this.f6008a);
        e0Var.f6009b = this.f6009b;
        e0Var.f6010c = new ArrayList(this.f6010c);
        e0Var.d = this.d;
        e0Var.e = this.e;
        e0Var.f6011f = this.f6011f;
        e0Var.f6012g = this.f6012g;
        e0Var.h = this.h;
        return e0Var;
    }
}
