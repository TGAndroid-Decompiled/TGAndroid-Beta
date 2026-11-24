package defpackage;
public abstract class fge {
    public static final void a(vb1 vb1Var, px2 px2Var, boolean z) {
        Object g;
        y6c y6cVar;
        Object r = vb1Var.r();
        Throwable f = vb1Var.f(r);
        if (f != null) {
            g = new sc9(f);
        } else {
            g = vb1Var.g(r);
        }
        if (z) {
            px2Var.getClass();
            rp3 rp3Var = (rp3) px2Var;
            qx2 qx2Var = rp3Var.e;
            Object obj = rp3Var.h;
            cy2 context = qx2Var.getContext();
            Object c = gfd.c(context, obj);
            if (c != gfd.a) {
                y6cVar = t1e.c(qx2Var, context, c);
            } else {
                y6cVar = null;
            }
            try {
                qx2Var.resumeWith(g);
                if (y6cVar != null && !y6cVar.S()) {
                    return;
                }
                gfd.a(context, c);
                return;
            } catch (Throwable th) {
                if (y6cVar == null || y6cVar.S()) {
                    gfd.a(context, c);
                }
                throw th;
            }
        }
        px2Var.resumeWith(g);
    }
}
