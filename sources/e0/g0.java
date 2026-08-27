package e0;

import java.util.ArrayList;

public final class g0 {

    public ArrayList f5056a = new ArrayList();

    public int f5057b = 1;

    public ArrayList f5058c = new ArrayList();
    public int d = 8388613;

    public int f5059e = -1;

    public int f5060f = 80;

    public String f5061g;
    public String h;

    public final void a(k kVar) {
        this.f5056a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f5056a = new ArrayList(this.f5056a);
        g0Var.f5057b = this.f5057b;
        g0Var.f5058c = new ArrayList(this.f5058c);
        g0Var.d = this.d;
        g0Var.f5059e = this.f5059e;
        g0Var.f5060f = this.f5060f;
        g0Var.f5061g = this.f5061g;
        g0Var.h = this.h;
        return g0Var;
    }
}
