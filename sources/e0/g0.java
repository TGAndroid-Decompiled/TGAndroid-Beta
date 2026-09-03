package e0;

import java.util.ArrayList;
public final class g0 {
    public ArrayList f4973a = new ArrayList();
    public int f4974b = 1;
    public ArrayList f4975c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f4976f = 80;
    public String f4977g;
    public String h;

    public final void a(k kVar) {
        this.f4973a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.f4973a = new ArrayList(this.f4973a);
        g0Var.f4974b = this.f4974b;
        g0Var.f4975c = new ArrayList(this.f4975c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f4976f = this.f4976f;
        g0Var.f4977g = this.f4977g;
        g0Var.h = this.h;
        return g0Var;
    }
}
