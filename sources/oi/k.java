package oi;

import org.telegram.ui.Components.hm0;
public final class k implements Runnable {
    public int f21085a;
    public int f21086b;
    public final hm0 f21087c;
    public final q d;

    public k(q qVar, hm0 hm0Var) {
        this.d = qVar;
        this.f21087c = hm0Var;
    }

    @Override
    public final void run() {
        hm0 hm0Var = this.f21087c;
        int scrollX = hm0Var.getScrollX();
        int scrollY = hm0Var.getScrollY();
        q qVar = this.d;
        qVar.f21107k += scrollX - this.f21085a;
        qVar.f21108l += scrollY - this.f21086b;
        this.f21085a = scrollX;
        this.f21086b = scrollY;
        qVar.f21104g++;
    }
}
