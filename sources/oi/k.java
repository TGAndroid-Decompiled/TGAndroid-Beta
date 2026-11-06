package oi;

import org.telegram.ui.Components.hm0;
public final class k implements Runnable {
    public int f21082a;
    public int f21083b;
    public final hm0 f21084c;
    public final q d;

    public k(q qVar, hm0 hm0Var) {
        this.d = qVar;
        this.f21084c = hm0Var;
    }

    @Override
    public final void run() {
        hm0 hm0Var = this.f21084c;
        int scrollX = hm0Var.getScrollX();
        int scrollY = hm0Var.getScrollY();
        q qVar = this.d;
        qVar.f21104k += scrollX - this.f21082a;
        qVar.f21105l += scrollY - this.f21083b;
        this.f21082a = scrollX;
        this.f21083b = scrollY;
        qVar.f21101g++;
    }
}
