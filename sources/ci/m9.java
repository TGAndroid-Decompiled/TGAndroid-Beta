package ci;
public final class m9 implements Runnable {
    public final int f5179a;
    public final y9 f5180b;

    public m9(y9 y9Var, int i10) {
        this.f5179a = i10;
        this.f5180b = y9Var;
    }

    @Override
    public final void run() {
        switch (this.f5179a) {
            case 0:
                fa faVar = this.f5180b.W;
                org.telegram.ui.Components.qc.h(faVar.container);
                fa.E(faVar);
                return;
            case 1:
                y9 y9Var = this.f5180b;
                y9Var.v.setLoading(false);
                fa faVar2 = y9Var.W;
                faVar2.f1();
                faVar2.f4697b.D(0);
                return;
            case 2:
                this.f5180b.U = false;
                return;
            case 3:
                fa faVar3 = this.f5180b.W;
                faVar3.M = 6;
                faVar3.f4697b.D(1);
                return;
            case 4:
                y9 y9Var2 = this.f5180b;
                y9Var2.f5884n.m(2);
                y9Var2.f5883f.forceLayout();
                y9Var2.j();
                return;
            default:
                y9 y9Var3 = this.f5180b;
                fa faVar4 = y9Var3.W;
                if (y9Var3.f5880a == 0) {
                    faVar4.dismiss();
                    return;
                } else {
                    faVar4.onBackPressed();
                    return;
                }
        }
    }
}
