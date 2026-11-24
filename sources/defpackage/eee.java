package defpackage;
public abstract class eee {
    public static final void a(na1 na1Var, fw2 fw2Var, boolean z) {
        Object g;
        y4c y4cVar;
        Object r = na1Var.r();
        Throwable f = na1Var.f(r);
        if (f != null) {
            g = new sa9(f);
        } else {
            g = na1Var.g(r);
        }
        if (z) {
            fw2Var.getClass();
            ho3 ho3Var = (ho3) fw2Var;
            gw2 gw2Var = ho3Var.e;
            Object obj = ho3Var.h;
            sw2 context = gw2Var.getContext();
            Object c = edd.c(context, obj);
            if (c != edd.a) {
                y4cVar = qzd.c(gw2Var, context, c);
            } else {
                y4cVar = null;
            }
            try {
                gw2Var.resumeWith(g);
                if (y4cVar != null && !y4cVar.S()) {
                    return;
                }
                edd.a(context, c);
                return;
            } catch (Throwable th) {
                if (y4cVar == null || y4cVar.S()) {
                    edd.a(context, c);
                }
                throw th;
            }
        }
        fw2Var.resumeWith(g);
    }
}
