package ci;
public final class l9 implements Runnable {
    public final int f5105a;
    public final x9 f5106b;

    public l9(x9 x9Var, int i10) {
        this.f5105a = i10;
        this.f5106b = x9Var;
    }

    @Override
    public final void run() {
        switch (this.f5105a) {
            case 0:
                ea eaVar = this.f5106b.W;
                org.telegram.ui.Components.qc.h(eaVar.container);
                ea.E(eaVar);
                return;
            case 1:
                x9 x9Var = this.f5106b;
                x9Var.v.setLoading(false);
                ea eaVar2 = x9Var.W;
                eaVar2.f1();
                eaVar2.f4672b.E(0);
                return;
            case 2:
                this.f5106b.U = false;
                return;
            case 3:
                ea eaVar3 = this.f5106b.W;
                eaVar3.M = 6;
                eaVar3.f4672b.E(1);
                return;
            case 4:
                x9 x9Var2 = this.f5106b;
                x9Var2.f5854n.m(2);
                x9Var2.f5853f.forceLayout();
                x9Var2.j();
                return;
            default:
                x9 x9Var3 = this.f5106b;
                ea eaVar4 = x9Var3.W;
                if (x9Var3.f5850a == 0) {
                    eaVar4.dismiss();
                    return;
                } else {
                    eaVar4.onBackPressed();
                    return;
                }
        }
    }
}
