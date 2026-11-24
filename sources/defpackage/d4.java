package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class d4 extends bl4 implements Runnable {
    public t56 n;
    public Object r;

    public static d4 o(t56 t56Var, aq4 aq4Var) {
        ?? obj = new Object();
        t56Var.getClass();
        obj.n = t56Var;
        obj.r = aq4Var;
        t56Var.b(obj, vn3.a);
        return obj;
    }

    @Override
    public final void d() {
        boolean z;
        t56 t56Var = this.n;
        boolean z2 = false;
        if (t56Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.a instanceof h2)) {
            Object obj = this.a;
            if ((obj instanceof h2) && ((h2) obj).a) {
                z2 = true;
            }
            t56Var.cancel(z2);
        }
        this.n = null;
        this.r = null;
    }

    @Override
    public final String j() {
        String str;
        t56 t56Var = this.n;
        Object obj = this.r;
        String j = super.j();
        if (t56Var != null) {
            str = "inputFuture=[" + t56Var + "], ";
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
        t56 t56Var = this.n;
        Object obj = this.r;
        boolean z2 = this.a instanceof h2;
        boolean z3 = true;
        if (t56Var == null) {
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
        if (t56Var.isCancelled()) {
            n(t56Var);
            return;
        }
        try {
            try {
                Object apply = ((aq4) obj).apply(jie.a(t56Var));
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
