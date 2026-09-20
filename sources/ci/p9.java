package ci;
public final class p9 implements Runnable {
    public final int f5314a;
    public final ba f5315b;

    public p9(ba baVar, int i10) {
        this.f5314a = i10;
        this.f5315b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f5314a) {
            case 0:
                ia iaVar = this.f5315b.W;
                org.telegram.ui.Components.pc.h(iaVar.container);
                ia.E(iaVar);
                return;
            case 1:
                ba baVar = this.f5315b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.f4807b.E(0);
                return;
            case 2:
                this.f5315b.U = false;
                return;
            case 3:
                ia iaVar3 = this.f5315b.W;
                iaVar3.M = 6;
                iaVar3.f4807b.E(1);
                return;
            case 4:
                ba baVar2 = this.f5315b;
                baVar2.f4406n.m(2);
                baVar2.f4405f.forceLayout();
                baVar2.j();
                return;
            default:
                ba baVar3 = this.f5315b;
                ia iaVar4 = baVar3.W;
                if (baVar3.f4402a == 0) {
                    iaVar4.dismiss();
                    return;
                } else {
                    iaVar4.onBackPressed();
                    return;
                }
        }
    }
}
