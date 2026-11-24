package defpackage;

import java.util.concurrent.CancellationException;
public abstract class tp3 extends aib {
    public int c;

    public tp3(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract px2 d();

    public Throwable f(Object obj) {
        qq2 qq2Var;
        if (obj instanceof qq2) {
            qq2Var = (qq2) obj;
        } else {
            qq2Var = null;
        }
        if (qq2Var == null) {
            return null;
        }
        return qq2Var.a;
    }

    public final void h(Throwable th) {
        dbe.a(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override
    public final void run() {
        y6c y6cVar;
        try {
            px2 d = d();
            d.getClass();
            rp3 rp3Var = (rp3) d;
            qx2 qx2Var = rp3Var.e;
            Object obj = rp3Var.h;
            cy2 context = qx2Var.getContext();
            Object c = gfd.c(context, obj);
            av5 av5Var = null;
            if (c != gfd.a) {
                y6cVar = t1e.c(qx2Var, context, c);
            } else {
                y6cVar = null;
            }
            cy2 context2 = qx2Var.getContext();
            Object i = i();
            Throwable f = f(i);
            if (f == null) {
                int i2 = this.c;
                boolean z = true;
                if (i2 != 1 && i2 != 2) {
                    z = false;
                }
                if (z) {
                    av5Var = (av5) context2.get(nf5.c);
                }
            }
            if (av5Var != null && !av5Var.isActive()) {
                CancellationException cancellationException = av5Var.getCancellationException();
                c(cancellationException);
                qx2Var.resumeWith(tue.a(cancellationException));
            } else if (f != null) {
                qx2Var.resumeWith(new sc9(f));
            } else {
                qx2Var.resumeWith(g(i));
            }
            if (y6cVar != null && !y6cVar.S()) {
                return;
            }
            gfd.a(context, c);
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
