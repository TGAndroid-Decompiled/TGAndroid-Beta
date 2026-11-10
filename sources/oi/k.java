package oi;

import org.telegram.ui.Components.hm0;
public final class k implements Runnable {
    public int f21090a;
    public int f21091b;
    public final hm0 f21092c;
    public final q d;

    public k(q qVar, hm0 hm0Var) {
        this.d = qVar;
        this.f21092c = hm0Var;
    }

    @Override
    public final void run() {
        hm0 hm0Var = this.f21092c;
        int scrollX = hm0Var.getScrollX();
        int scrollY = hm0Var.getScrollY();
        q qVar = this.d;
        qVar.f21112k += scrollX - this.f21090a;
        qVar.f21113l += scrollY - this.f21091b;
        this.f21090a = scrollX;
        this.f21091b = scrollY;
        qVar.f21109g++;
    }
}
