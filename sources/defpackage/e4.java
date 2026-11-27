package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class e4 extends gn4 implements Runnable {
    public x76 n;
    public Object r;

    public static e4 o(x76 x76Var, es4 es4Var) {
        ?? obj = new Object();
        x76Var.getClass();
        obj.n = x76Var;
        obj.r = es4Var;
        x76Var.b(obj, mo3.a);
        return obj;
    }

    @Override
    public final void d() {
        boolean z;
        x76 x76Var = this.n;
        boolean z2 = false;
        if (x76Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.a instanceof i2)) {
            Object obj = this.a;
            if ((obj instanceof i2) && ((i2) obj).a) {
                z2 = true;
            }
            x76Var.cancel(z2);
        }
        this.n = null;
        this.r = null;
    }

    @Override
    public final String j() {
        String str;
        x76 x76Var = this.n;
        Object obj = this.r;
        String j = super.j();
        if (x76Var != null) {
            str = "inputFuture=[" + x76Var + "], ";
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
        x76 x76Var = this.n;
        Object obj = this.r;
        boolean z2 = this.a instanceof i2;
        boolean z3 = true;
        if (x76Var == null) {
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
        if (x76Var.isCancelled()) {
            n(x76Var);
            return;
        }
        try {
            try {
                Object apply = ((es4) obj).apply(fne.a(x76Var));
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
