package defpackage;

import java.util.concurrent.CancellationException;
public abstract class ap3 extends vjb {
    public int c;

    public ap3(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract zw2 d();

    public Throwable f(Object obj) {
        yp2 yp2Var;
        if (obj instanceof yp2) {
            yp2Var = (yp2) obj;
        } else {
            yp2Var = null;
        }
        if (yp2Var == null) {
            return null;
        }
        return yp2Var.a;
    }

    public final void h(Throwable th) {
        sde.a(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override
    public final void run() {
        x8c x8cVar;
        try {
            zw2 d = d();
            d.getClass();
            yo3 yo3Var = (yo3) d;
            ax2 ax2Var = yo3Var.e;
            Object obj = yo3Var.h;
            mx2 context = ax2Var.getContext();
            Object c = xhd.c(context, obj);
            ev5 ev5Var = null;
            if (c != xhd.a) {
                x8cVar = g4e.c(ax2Var, context, c);
            } else {
                x8cVar = null;
            }
            mx2 context2 = ax2Var.getContext();
            Object i = i();
            Throwable f = f(i);
            if (f == null) {
                int i2 = this.c;
                boolean z = true;
                if (i2 != 1 && i2 != 2) {
                    z = false;
                }
                if (z) {
                    ev5Var = (ev5) context2.get(qf5.c);
                }
            }
            if (ev5Var != null && !ev5Var.isActive()) {
                CancellationException cancellationException = ev5Var.getCancellationException();
                c(cancellationException);
                ax2Var.resumeWith(ixe.a(cancellationException));
            } else if (f != null) {
                ax2Var.resumeWith(new ge9(f));
            } else {
                ax2Var.resumeWith(g(i));
            }
            if (x8cVar != null && !x8cVar.S()) {
                return;
            }
            xhd.a(context, c);
        } catch (Throwable th) {
            h(th);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
