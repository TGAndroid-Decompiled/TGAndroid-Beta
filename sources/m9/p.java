package m9;

import c8.r9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class p extends s implements Runnable {
    public y f20589n;
    public g9.k f20590r;

    @Override
    public final void d() {
        boolean z10;
        y yVar = this.f20589n;
        boolean z11 = false;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & (this.f20586a instanceof a)) {
            Object obj = this.f20586a;
            if ((obj instanceof a) && ((a) obj).f20554a) {
                z11 = true;
            }
            yVar.cancel(z11);
        }
        this.f20589n = null;
        this.f20590r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f20589n;
        g9.k kVar = this.f20590r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return r.b.v(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z10;
        y yVar = this.f20589n;
        g9.k kVar = this.f20590r;
        boolean z11 = this.f20586a instanceof a;
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
        this.f20589n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(r9.a(yVar));
                this.f20590r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f20590r = null;
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
