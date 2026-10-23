package j9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import si.o0;
import v7.q8;
public final class p extends s implements Runnable {
    public y f14399n;
    public d9.k f14400r;

    @Override
    public final void d() {
        boolean z10;
        y yVar = this.f14399n;
        boolean z11 = false;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & (this.f14396a instanceof a)) {
            Object obj = this.f14396a;
            if ((obj instanceof a) && ((a) obj).f14367a) {
                z11 = true;
            }
            yVar.cancel(z11);
        }
        this.f14399n = null;
        this.f14400r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f14399n;
        d9.k kVar = this.f14400r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return o0.u(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z10;
        y yVar = this.f14399n;
        d9.k kVar = this.f14400r;
        boolean z11 = this.f14396a instanceof a;
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
        this.f14399n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(q8.a(yVar));
                this.f14400r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f14400r = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e7) {
            n(e7.getCause());
        } catch (Exception e10) {
            n(e10);
        }
    }
}
