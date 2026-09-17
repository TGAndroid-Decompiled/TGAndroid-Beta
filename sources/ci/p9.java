package ci;
public final class p9 implements Runnable {
    public final int f5313a;
    public final ba f5314b;

    public p9(ba baVar, int i10) {
        this.f5313a = i10;
        this.f5314b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f5313a) {
            case 0:
                ia iaVar = this.f5314b.W;
                org.telegram.ui.Components.oc.h(iaVar.container);
                ia.E(iaVar);
                return;
            case 1:
                ba baVar = this.f5314b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.f4806b.E(0);
                return;
            case 2:
                this.f5314b.U = false;
                return;
            case 3:
                ia iaVar3 = this.f5314b.W;
                iaVar3.M = 6;
                iaVar3.f4806b.E(1);
                return;
            case 4:
                ba baVar2 = this.f5314b;
                baVar2.f4405n.m(2);
                baVar2.f4404f.forceLayout();
                baVar2.j();
                return;
            default:
                ba baVar3 = this.f5314b;
                ia iaVar4 = baVar3.W;
                if (baVar3.f4401a == 0) {
                    iaVar4.dismiss();
                    return;
                } else {
                    iaVar4.onBackPressed();
                    return;
                }
        }
    }
}
