package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class d4 extends bn4 implements Runnable {
    public t76 n;
    public Object r;

    public static d4 o(t76 t76Var, bs4 bs4Var) {
        ?? obj = new Object();
        t76Var.getClass();
        obj.n = t76Var;
        obj.r = bs4Var;
        t76Var.b(obj, fp3.a);
        return obj;
    }

    @Override
    public final void d() {
        boolean z;
        t76 t76Var = this.n;
        boolean z2 = false;
        if (t76Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.a instanceof h2)) {
            Object obj = this.a;
            if ((obj instanceof h2) && ((h2) obj).a) {
                z2 = true;
            }
            t76Var.cancel(z2);
        }
        this.n = null;
        this.r = null;
    }

    @Override
    public final String j() {
        String str;
        t76 t76Var = this.n;
        Object obj = this.r;
        String j = super.j();
        if (t76Var != null) {
            str = "inputFuture=[" + t76Var + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (j != null) {
            return str.concat(j);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z;
        t76 t76Var = this.n;
        Object obj = this.r;
        boolean z2 = this.a instanceof h2;
        boolean z3 = true;
        if (t76Var == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        if (obj != null) {
            z3 = false;
        }
        if (z4 | z3) {
            return;
        }
        this.n = null;
        if (t76Var.isCancelled()) {
            n(t76Var);
            return;
        }
        try {
            try {
                Object apply = ((bs4) obj).apply(kke.a(t76Var));
                this.r = null;
                l(apply);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.r = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
