package oi;

import org.telegram.ui.Components.hp0;
public final class k implements Runnable {
    public int f19469a;
    public int f19470b;
    public final hp0 f19471c;
    public final q d;

    public k(q qVar, hp0 hp0Var) {
        this.d = qVar;
        this.f19471c = hp0Var;
    }

    @Override
    public final void run() {
        hp0 hp0Var = this.f19471c;
        int scrollX = hp0Var.getScrollX();
        int scrollY = hp0Var.getScrollY();
        q qVar = this.d;
        qVar.f19486i += scrollX - this.f19469a;
        qVar.f19487j += scrollY - this.f19470b;
        this.f19469a = scrollX;
        this.f19470b = scrollY;
        qVar.e++;
    }
}
