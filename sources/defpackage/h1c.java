package defpackage;

import java.util.HashMap;
public final class h1c {
    public final ra0 a;
    public final String b;
    public final s24 c;
    public final yyb d;
    public final i1c e;

    public h1c(ra0 ra0Var, String str, s24 s24Var, yyb yybVar, i1c i1cVar) {
        this.a = ra0Var;
        this.b = str;
        this.c = s24Var;
        this.d = yybVar;
        this.e = i1cVar;
    }

    public final void a(n90 n90Var, j1c j1cVar) {
        yyb yybVar = this.d;
        if (yybVar != null) {
            i1c i1cVar = this.e;
            yb3 yb3Var = i1cVar.c;
            ra0 b = this.a.b(n90Var.c);
            ?? obj = new Object();
            obj.h = new HashMap();
            obj.f = Long.valueOf(i1cVar.a.e());
            obj.g = Long.valueOf(i1cVar.b.e());
            obj.a = this.b;
            obj.e = new o24(this.c, (byte[]) yybVar.apply(n90Var.b));
            obj.c = n90Var.a;
            ha0 ha0Var = n90Var.d;
            if (ha0Var != null) {
                obj.d = ha0Var.a;
            }
            yb3Var.b.execute(new hn1(yb3Var, b, j1cVar, obj.b(), (byte) 12));
            return;
        }
        fvc.f("Null transformer");
    }
}
