package defpackage;

import java.util.HashMap;
public final class h3c {
    public final rb0 a;
    public final String b;
    public final d44 c;
    public final z0c d;
    public final i3c e;

    public h3c(rb0 rb0Var, String str, d44 d44Var, z0c z0cVar, i3c i3cVar) {
        this.a = rb0Var;
        this.b = str;
        this.c = d44Var;
        this.d = z0cVar;
        this.e = i3cVar;
    }

    public final void a(na0 na0Var, j3c j3cVar) {
        z0c z0cVar = this.d;
        if (z0cVar != null) {
            i3c i3cVar = this.e;
            kd3 kd3Var = i3cVar.c;
            rb0 b = this.a.b(na0Var.c);
            ?? obj = new Object();
            obj.h = new HashMap();
            obj.f = Long.valueOf(i3cVar.a.a());
            obj.g = Long.valueOf(i3cVar.b.a());
            obj.a = this.b;
            obj.e = new z34(this.c, (byte[]) z0cVar.apply(na0Var.b));
            obj.c = na0Var.a;
            hb0 hb0Var = na0Var.d;
            if (hb0Var != null) {
                obj.d = hb0Var.a;
            }
            kd3Var.b.execute(new xo1(kd3Var, b, j3cVar, obj.b(), (byte) 12));
            return;
        }
        gxc.d("Null transformer");
    }
}
