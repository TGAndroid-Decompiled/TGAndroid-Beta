package e0;

import java.util.ArrayList;
public final class e0 {
    public ArrayList f8404a = new ArrayList();
    public int f8405b = 1;
    public ArrayList f8406c = new ArrayList();
    public int d = 8388613;
    public int f8407e = -1;
    public int f8408f = 80;
    public String f8409g;
    public String h;

    public final void a(i iVar) {
        this.f8404a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.f8404a = new ArrayList(this.f8404a);
        e0Var.f8405b = this.f8405b;
        e0Var.f8406c = new ArrayList(this.f8406c);
        e0Var.d = this.d;
        e0Var.f8407e = this.f8407e;
        e0Var.f8408f = this.f8408f;
        e0Var.f8409g = this.f8409g;
        e0Var.h = this.h;
        return e0Var;
    }
}
