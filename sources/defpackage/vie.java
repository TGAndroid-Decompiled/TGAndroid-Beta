package defpackage;
public abstract class vie {
    public static final void a(va1 va1Var, zw2 zw2Var, boolean z) {
        Object g;
        x8c x8cVar;
        Object r = va1Var.r();
        Throwable f = va1Var.f(r);
        if (f != null) {
            g = new ge9(f);
        } else {
            g = va1Var.g(r);
        }
        if (z) {
            zw2Var.getClass();
            yo3 yo3Var = (yo3) zw2Var;
            ax2 ax2Var = yo3Var.e;
            Object obj = yo3Var.h;
            mx2 context = ax2Var.getContext();
            Object c = xhd.c(context, obj);
            if (c != xhd.a) {
                x8cVar = g4e.c(ax2Var, context, c);
            } else {
                x8cVar = null;
            }
            try {
                ax2Var.resumeWith(g);
                if (x8cVar != null && !x8cVar.S()) {
                    return;
                }
                xhd.a(context, c);
                return;
            } catch (Throwable th) {
                if (x8cVar == null || x8cVar.S()) {
                    xhd.a(context, c);
                }
                throw th;
            }
        }
        zw2Var.resumeWith(g);
    }
}
