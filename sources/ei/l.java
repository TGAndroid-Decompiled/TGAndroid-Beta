package ei;

import org.telegram.ui.Components.in0;
public final class l implements Runnable {
    public int f6657a;
    public int f6658b;
    public final in0 f6659c;
    public final r d;

    public l(r rVar, in0 in0Var) {
        this.d = rVar;
        this.f6659c = in0Var;
    }

    @Override
    public final void run() {
        in0 in0Var = this.f6659c;
        int scrollX = in0Var.getScrollX();
        int scrollY = in0Var.getScrollY();
        r rVar = this.d;
        rVar.f6677k += scrollX - this.f6657a;
        rVar.f6678l += scrollY - this.f6658b;
        this.f6657a = scrollX;
        this.f6658b = scrollY;
        rVar.f6674g++;
    }
}
