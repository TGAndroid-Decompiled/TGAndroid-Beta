package ei;

import org.telegram.ui.Components.jn0;
public final class l implements Runnable {
    public int f6658a;
    public int f6659b;
    public final jn0 f6660c;
    public final r d;

    public l(r rVar, jn0 jn0Var) {
        this.d = rVar;
        this.f6660c = jn0Var;
    }

    @Override
    public final void run() {
        jn0 jn0Var = this.f6660c;
        int scrollX = jn0Var.getScrollX();
        int scrollY = jn0Var.getScrollY();
        r rVar = this.d;
        rVar.f6678k += scrollX - this.f6658a;
        rVar.f6679l += scrollY - this.f6659b;
        this.f6658a = scrollX;
        this.f6659b = scrollY;
        rVar.f6675g++;
    }
}
