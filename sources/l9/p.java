package l9;

import b8.yd;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class p extends s implements Runnable {
    public y f18160n;
    public f9.k f18161r;

    @Override
    public final void e() {
        boolean z10;
        y yVar = this.f18160n;
        boolean z11 = false;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & (this.f18157a instanceof a)) {
            Object obj = this.f18157a;
            if ((obj instanceof a) && ((a) obj).f18125a) {
                z11 = true;
            }
            yVar.cancel(z11);
        }
        this.f18160n = null;
        this.f18161r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f18160n;
        f9.k kVar = this.f18161r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return t4.c.q(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z10;
        y yVar = this.f18160n;
        f9.k kVar = this.f18161r;
        boolean z11 = this.f18157a instanceof a;
        boolean z12 = true;
        if (yVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z11 | z10;
        if (kVar != null) {
            z12 = false;
        }
        if (z13 | z12) {
            return;
        }
        this.f18160n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(yd.a(yVar));
                this.f18161r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f18161r = null;
                }
            }
        } catch (Error e10) {
            n(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            n(e11.getCause());
        } catch (Exception e12) {
            n(e12);
        }
    }
}
