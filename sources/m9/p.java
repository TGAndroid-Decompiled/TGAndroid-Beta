package m9;

import c8.s9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
public final class p extends s implements Runnable {
    public y f19992n;
    public g9.k f19993r;

    @Override
    public final void d() {
        boolean z9;
        y yVar = this.f19992n;
        boolean z10 = false;
        if (yVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 & (this.f19989a instanceof a)) {
            Object obj = this.f19989a;
            if ((obj instanceof a) && ((a) obj).f19957a) {
                z10 = true;
            }
            yVar.cancel(z10);
        }
        this.f19992n = null;
        this.f19993r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f19992n;
        g9.k kVar = this.f19993r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return rf.b.r(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z9;
        y yVar = this.f19992n;
        g9.k kVar = this.f19993r;
        boolean z10 = this.f19989a instanceof a;
        boolean z11 = true;
        if (yVar == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z10 | z9;
        if (kVar != null) {
            z11 = false;
        }
        if (z12 | z11) {
            return;
        }
        this.f19992n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(s9.a(yVar));
                this.f19993r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f19993r = null;
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
