package k9;

import a8.qd;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.ui.Components.b10;
public final class p extends s implements Runnable {
    public y f16488n;
    public e9.k f16489r;

    @Override
    public final void d() {
        boolean z10;
        y yVar = this.f16488n;
        boolean z11 = false;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & (this.f16485a instanceof a)) {
            Object obj = this.f16485a;
            if ((obj instanceof a) && ((a) obj).f16456a) {
                z11 = true;
            }
            yVar.cancel(z11);
        }
        this.f16488n = null;
        this.f16489r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f16488n;
        e9.k kVar = this.f16489r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return b10.u(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z10;
        y yVar = this.f16488n;
        e9.k kVar = this.f16489r;
        boolean z11 = this.f16485a instanceof a;
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
        this.f16488n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(qd.a(yVar));
                this.f16489r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f16489r = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            n(e10.getCause());
        } catch (Exception e11) {
            n(e11);
        }
    }
}
