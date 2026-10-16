package e0;

import java.util.ArrayList;
public final class e0 {
    public ArrayList f8213a = new ArrayList();
    public int f8214b = 1;
    public ArrayList f8215c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8216f = 80;
    public String f8217g;
    public String h;

    public final void a(i iVar) {
        this.f8213a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.f8213a = new ArrayList(this.f8213a);
        e0Var.f8214b = this.f8214b;
        e0Var.f8215c = new ArrayList(this.f8215c);
        e0Var.d = this.d;
        e0Var.e = this.e;
        e0Var.f8216f = this.f8216f;
        e0Var.f8217g = this.f8217g;
        e0Var.h = this.h;
        return e0Var;
    }
}
