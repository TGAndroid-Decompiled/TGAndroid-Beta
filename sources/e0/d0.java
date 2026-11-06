package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10038a = new ArrayList();
    public int f10039b = 1;
    public ArrayList f10040c = new ArrayList();
    public int d = 8388613;
    public int f10041e = -1;
    public int f10042f = 80;
    public String f10043g;
    public String h;

    public final void a(h hVar) {
        this.f10038a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10038a = new ArrayList(this.f10038a);
        d0Var.f10039b = this.f10039b;
        d0Var.f10040c = new ArrayList(this.f10040c);
        d0Var.d = this.d;
        d0Var.f10041e = this.f10041e;
        d0Var.f10042f = this.f10042f;
        d0Var.f10043g = this.f10043g;
        d0Var.h = this.h;
        return d0Var;
    }
}
