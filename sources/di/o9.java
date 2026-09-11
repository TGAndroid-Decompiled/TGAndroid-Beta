package di;
public final class o9 implements Runnable {
    public final int f7793a;
    public final ba f7794b;

    public o9(ba baVar, int i10) {
        this.f7793a = i10;
        this.f7794b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f7793a) {
            case 0:
                ia iaVar = this.f7794b.W;
                org.telegram.ui.Components.qc.h(iaVar.container);
                ia.D(iaVar);
                return;
            case 1:
                ba baVar = this.f7794b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.f7390b.D(0);
                return;
            case 2:
                this.f7794b.U = false;
                return;
            case 3:
                ia iaVar3 = this.f7794b.W;
                iaVar3.M = 6;
                iaVar3.f7390b.D(1);
                return;
            case 4:
                ba baVar2 = this.f7794b;
                baVar2.f6961n.m(2);
                baVar2.f6960f.forceLayout();
                baVar2.j();
                return;
            default:
                ba baVar3 = this.f7794b;
                ia iaVar4 = baVar3.W;
                if (baVar3.f6956a == 0) {
                    iaVar4.dismiss();
                    return;
                } else {
                    iaVar4.onBackPressed();
                    return;
                }
        }
    }
}
