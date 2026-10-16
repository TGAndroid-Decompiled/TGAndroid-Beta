package di;
public final class l9 implements Runnable {
    public final int f7368a;
    public final x9 f7369b;

    public l9(x9 x9Var, int i10) {
        this.f7368a = i10;
        this.f7369b = x9Var;
    }

    @Override
    public final void run() {
        switch (this.f7368a) {
            case 0:
                ea eaVar = this.f7369b.W;
                org.telegram.ui.Components.sc.h(eaVar.container);
                ea.F(eaVar);
                return;
            case 1:
                x9 x9Var = this.f7369b;
                x9Var.v.setLoading(false);
                ea eaVar2 = x9Var.W;
                eaVar2.g1();
                eaVar2.f6917b.D(0);
                return;
            case 2:
                this.f7369b.U = false;
                return;
            case 3:
                ea eaVar3 = this.f7369b.W;
                eaVar3.M = 6;
                eaVar3.f6917b.D(1);
                return;
            case 4:
                x9 x9Var2 = this.f7369b;
                x9Var2.f8100n.m(2);
                x9Var2.f8099f.forceLayout();
                x9Var2.j();
                return;
            default:
                x9 x9Var3 = this.f7369b;
                ea eaVar4 = x9Var3.W;
                if (x9Var3.f8096a == 0) {
                    eaVar4.dismiss();
                    return;
                } else {
                    eaVar4.onBackPressed();
                    return;
                }
        }
    }
}
