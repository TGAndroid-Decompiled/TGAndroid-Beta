package ci;
public final class p9 implements Runnable {
    public final int f5312a;
    public final ba f5313b;

    public p9(ba baVar, int i10) {
        this.f5312a = i10;
        this.f5313b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f5312a) {
            case 0:
                ia iaVar = this.f5313b.W;
                org.telegram.ui.Components.pc.h(iaVar.container);
                ia.D(iaVar);
                return;
            case 1:
                ba baVar = this.f5313b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.f4805b.E(0);
                return;
            case 2:
                this.f5313b.U = false;
                return;
            case 3:
                ia iaVar3 = this.f5313b.W;
                iaVar3.M = 6;
                iaVar3.f4805b.E(1);
                return;
            case 4:
                ba baVar2 = this.f5313b;
                baVar2.f4404n.m(2);
                baVar2.f4403f.forceLayout();
                baVar2.j();
                return;
            default:
                ba baVar3 = this.f5313b;
                ia iaVar4 = baVar3.W;
                if (baVar3.f4400a == 0) {
                    iaVar4.dismiss();
                    return;
                } else {
                    iaVar4.onBackPressed();
                    return;
                }
        }
    }
}
