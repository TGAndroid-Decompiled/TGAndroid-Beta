package e0;

import java.util.ArrayList;
public final class d0 {
    public ArrayList f10189a = new ArrayList();
    public int f10190b = 1;
    public ArrayList f10191c = new ArrayList();
    public int d = 8388613;
    public int f10192e = -1;
    public int f10193f = 80;
    public String f10194g;
    public String h;

    public final void a(h hVar) {
        this.f10189a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.f10189a = new ArrayList(this.f10189a);
        d0Var.f10190b = this.f10190b;
        d0Var.f10191c = new ArrayList(this.f10191c);
        d0Var.d = this.d;
        d0Var.f10192e = this.f10192e;
        d0Var.f10193f = this.f10193f;
        d0Var.f10194g = this.f10194g;
        d0Var.h = this.h;
        return d0Var;
    }
}
