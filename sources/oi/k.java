package oi;

import org.telegram.ui.Components.gp0;
public final class k implements Runnable {
    public int f19470a;
    public int f19471b;
    public final gp0 f19472c;
    public final q d;

    public k(q qVar, gp0 gp0Var) {
        this.d = qVar;
        this.f19472c = gp0Var;
    }

    @Override
    public final void run() {
        gp0 gp0Var = this.f19472c;
        int scrollX = gp0Var.getScrollX();
        int scrollY = gp0Var.getScrollY();
        q qVar = this.d;
        qVar.f19487i += scrollX - this.f19470a;
        qVar.f19488j += scrollY - this.f19471b;
        this.f19470a = scrollX;
        this.f19471b = scrollY;
        qVar.e++;
    }
}
