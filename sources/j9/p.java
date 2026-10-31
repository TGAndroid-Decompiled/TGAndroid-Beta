package j9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import v7.p8;
public final class p extends s implements Runnable {
    public y f9761n;
    public d9.k f9762r;

    @Override
    public final void d() {
        boolean z10;
        y yVar = this.f9761n;
        boolean z11 = false;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & (this.f9758a instanceof a)) {
            Object obj = this.f9758a;
            if ((obj instanceof a) && ((a) obj).f9729a) {
                z11 = true;
            }
            yVar.cancel(z11);
        }
        this.f9761n = null;
        this.f9762r = null;
    }

    @Override
    public final String k() {
        String str;
        y yVar = this.f9761n;
        d9.k kVar = this.f9762r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar != null) {
            return str + "function=[" + kVar + "]";
        } else if (k10 != null) {
            return sc.e.A(str, k10);
        } else {
            return null;
        }
    }

    @Override
    public final void run() {
        boolean z10;
        y yVar = this.f9761n;
        d9.k kVar = this.f9762r;
        boolean z11 = this.f9758a instanceof a;
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
        this.f9761n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(p8.a(yVar));
                this.f9762r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f9762r = null;
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
