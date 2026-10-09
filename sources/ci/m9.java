package ci;
public final class m9 implements Runnable {
    public final int f5609a;
    public final y9 f5610b;

    public m9(y9 y9Var, int i10) {
        this.f5609a = i10;
        this.f5610b = y9Var;
    }

    @Override
    public final void run() {
        switch (this.f5609a) {
            case 0:
                fa faVar = this.f5610b.W;
                org.telegram.ui.Components.tc.h(faVar.container);
                fa.F(faVar);
                return;
            case 1:
                y9 y9Var = this.f5610b;
                y9Var.v.setLoading(false);
                fa faVar2 = y9Var.W;
                faVar2.g1();
                faVar2.f5094b.D(0);
                return;
            case 2:
                this.f5610b.U = false;
                return;
            case 3:
                fa faVar3 = this.f5610b.W;
                faVar3.M = 6;
                faVar3.f5094b.D(1);
                return;
            case 4:
                y9 y9Var2 = this.f5610b;
                y9Var2.f6365n.m(2);
                y9Var2.f6364f.forceLayout();
                y9Var2.j();
                return;
            default:
                y9 y9Var3 = this.f5610b;
                fa faVar4 = y9Var3.W;
                if (y9Var3.f6360a == 0) {
                    faVar4.dismiss();
                    return;
                } else {
                    faVar4.onBackPressed();
                    return;
                }
        }
    }
}
