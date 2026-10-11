package ci;
public final class m9 implements Runnable {
    public final int f5608a;
    public final y9 f5609b;

    public m9(y9 y9Var, int i10) {
        this.f5608a = i10;
        this.f5609b = y9Var;
    }

    @Override
    public final void run() {
        switch (this.f5608a) {
            case 0:
                fa faVar = this.f5609b.W;
                org.telegram.ui.Components.sc.h(faVar.container);
                fa.F(faVar);
                return;
            case 1:
                y9 y9Var = this.f5609b;
                y9Var.v.setLoading(false);
                fa faVar2 = y9Var.W;
                faVar2.g1();
                faVar2.f5093b.D(0);
                return;
            case 2:
                this.f5609b.U = false;
                return;
            case 3:
                fa faVar3 = this.f5609b.W;
                faVar3.M = 6;
                faVar3.f5093b.D(1);
                return;
            case 4:
                y9 y9Var2 = this.f5609b;
                y9Var2.f6364n.m(2);
                y9Var2.f6363f.forceLayout();
                y9Var2.j();
                return;
            default:
                y9 y9Var3 = this.f5609b;
                fa faVar4 = y9Var3.W;
                if (y9Var3.f6359a == 0) {
                    faVar4.dismiss();
                    return;
                } else {
                    faVar4.onBackPressed();
                    return;
                }
        }
    }
}
