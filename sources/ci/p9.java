package ci;
public final class p9 implements Runnable {
    public final int f5310a;
    public final ba f5311b;

    public p9(ba baVar, int i10) {
        this.f5310a = i10;
        this.f5311b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f5310a) {
            case 0:
                ia iaVar = this.f5311b.W;
                org.telegram.ui.Components.oc.h(iaVar.container);
                ia.E(iaVar);
                return;
            case 1:
                ba baVar = this.f5311b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.f4803b.D(0);
                return;
            case 2:
                this.f5311b.U = false;
                return;
            case 3:
                ia iaVar3 = this.f5311b.W;
                iaVar3.M = 6;
                iaVar3.f4803b.D(1);
                return;
            case 4:
                ba baVar2 = this.f5311b;
                baVar2.f4402n.m(2);
                baVar2.f4401f.forceLayout();
                baVar2.j();
                return;
            default:
                ba baVar3 = this.f5311b;
                ia iaVar4 = baVar3.W;
                if (baVar3.f4398a == 0) {
                    iaVar4.dismiss();
                    return;
                } else {
                    iaVar4.onBackPressed();
                    return;
                }
        }
    }
}
