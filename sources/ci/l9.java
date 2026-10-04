package ci;
public final class l9 implements Runnable {
    public final int f5499a;
    public final x9 f5500b;

    public l9(x9 x9Var, int i10) {
        this.f5499a = i10;
        this.f5500b = x9Var;
    }

    @Override
    public final void run() {
        switch (this.f5499a) {
            case 0:
                ea eaVar = this.f5500b.W;
                org.telegram.ui.Components.rc.h(eaVar.container);
                ea.C(eaVar);
                return;
            case 1:
                x9 x9Var = this.f5500b;
                x9Var.v.setLoading(false);
                ea eaVar2 = x9Var.W;
                eaVar2.f1();
                eaVar2.f5047b.E(0);
                return;
            case 2:
                this.f5500b.U = false;
                return;
            case 3:
                ea eaVar3 = this.f5500b.W;
                eaVar3.M = 6;
                eaVar3.f5047b.E(1);
                return;
            case 4:
                x9 x9Var2 = this.f5500b;
                x9Var2.f6307n.m(2);
                x9Var2.f6306f.forceLayout();
                x9Var2.j();
                return;
            default:
                x9 x9Var3 = this.f5500b;
                ea eaVar4 = x9Var3.W;
                if (x9Var3.f6302a == 0) {
                    eaVar4.dismiss();
                    return;
                } else {
                    eaVar4.onBackPressed();
                    return;
                }
        }
    }
}
