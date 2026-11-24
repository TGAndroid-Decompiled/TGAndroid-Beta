package defpackage;

import java.util.concurrent.CancellationException;
public abstract class jo3 extends zfb {
    public int c;

    public jo3(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract fw2 d();

    public Throwable f(Object obj) {
        fp2 fp2Var;
        if (obj instanceof fp2) {
            fp2Var = (fp2) obj;
        } else {
            fp2Var = null;
        }
        if (fp2Var == null) {
            return null;
        }
        return fp2Var.a;
    }

    public final void h(Throwable th) {
        c9e.a(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override
    public final void run() {
        y4c y4cVar;
        try {
            fw2 d = d();
            d.getClass();
            ho3 ho3Var = (ho3) d;
            gw2 gw2Var = ho3Var.e;
            Object obj = ho3Var.h;
            sw2 context = gw2Var.getContext();
            Object c = edd.c(context, obj);
            bt5 bt5Var = null;
            if (c != edd.a) {
                y4cVar = qzd.c(gw2Var, context, c);
            } else {
                y4cVar = null;
            }
            sw2 context2 = gw2Var.getContext();
            Object i = i();
            Throwable f = f(i);
            if (f == null) {
                int i2 = this.c;
                boolean z = true;
                if (i2 != 1 && i2 != 2) {
                    z = false;
                }
                if (z) {
                    bt5Var = (bt5) context2.get(pd5.c);
                }
            }
            if (bt5Var != null && !bt5Var.isActive()) {
                CancellationException cancellationException = bt5Var.getCancellationException();
                c(cancellationException);
                gw2Var.resumeWith(qse.a(cancellationException));
            } else if (f != null) {
                gw2Var.resumeWith(new sa9(f));
            } else {
                gw2Var.resumeWith(g(i));
            }
            if (y4cVar != null && !y4cVar.S()) {
                return;
            }
            edd.a(context, c);
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
