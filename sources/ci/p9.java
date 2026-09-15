package ci;
public final class p9 implements Runnable {
    public final int f5308a;
    public final ba f5309b;

    public p9(ba baVar, int i10) {
        this.f5308a = i10;
        this.f5309b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f5308a) {
            case 0:
                ia iaVar = this.f5309b.W;
                org.telegram.ui.Components.oc.h(iaVar.container);
                ia.E(iaVar);
                return;
            case 1:
                ba baVar = this.f5309b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.f4801b.D(0);
                return;
            case 2:
                this.f5309b.U = false;
                return;
            case 3:
                ia iaVar3 = this.f5309b.W;
                iaVar3.M = 6;
                iaVar3.f4801b.D(1);
                return;
            case 4:
                ba baVar2 = this.f5309b;
                baVar2.f4400n.m(2);
                baVar2.f4399f.forceLayout();
                baVar2.j();
                return;
            default:
                ba baVar3 = this.f5309b;
                ia iaVar4 = baVar3.W;
                if (baVar3.f4396a == 0) {
                    iaVar4.dismiss();
                    return;
                } else {
                    iaVar4.onBackPressed();
                    return;
                }
        }
    }
}
