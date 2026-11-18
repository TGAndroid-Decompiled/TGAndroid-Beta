package m9;

import c8.t9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class p extends s implements Runnable {
    public y f20953n;
    public g9.k f20954r;

    @Override
    public final void d() {
        boolean z10;
        y yVar = this.f20953n;
        boolean z11 = false;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & (this.f20950a instanceof a)) {
            Object obj = this.f20950a;
            if ((obj instanceof a) && ((a) obj).f20918a) {
                z11 = true;
            }
            yVar.cancel(z11);
        }
        this.f20953n = null;
        this.f20954r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f20953n;
        g9.k kVar = this.f20954r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return p5.c.v(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z10;
        y yVar = this.f20953n;
        g9.k kVar = this.f20954r;
        boolean z11 = this.f20950a instanceof a;
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
        this.f20953n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(t9.a(yVar));
                this.f20954r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f20954r = null;
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
