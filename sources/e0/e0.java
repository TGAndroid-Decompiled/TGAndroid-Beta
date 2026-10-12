package e0;

import java.util.ArrayList;
public final class e0 {
    public ArrayList f8210a = new ArrayList();
    public int f8211b = 1;
    public ArrayList f8212c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f8213f = 80;
    public String f8214g;
    public String h;

    public final void a(i iVar) {
        this.f8210a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.f8210a = new ArrayList(this.f8210a);
        e0Var.f8211b = this.f8211b;
        e0Var.f8212c = new ArrayList(this.f8212c);
        e0Var.d = this.d;
        e0Var.e = this.e;
        e0Var.f8213f = this.f8213f;
        e0Var.f8214g = this.f8214g;
        e0Var.h = this.h;
        return e0Var;
    }
}
