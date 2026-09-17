package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;
public final class p4 implements Runnable {
    public final int f3525a;
    public final pb f3526b;

    public p4(pb pbVar, int i10) {
        this.f3525a = i10;
        this.f3526b = pbVar;
    }

    @Override
    public final void run() {
        switch (this.f3525a) {
            case 0:
                this.f3526b.P();
                return;
            case 1:
                pb pbVar = this.f3526b;
                pbVar.f3565c0 = true;
                pbVar.n(true);
                return;
            case 2:
                pb pbVar2 = this.f3526b;
                if (pbVar2.F != null) {
                    eb ebVar = pbVar2.v;
                    if (ebVar != null) {
                        b0.f2813c = true;
                        ebVar.setLayerType(2, null);
                    }
                    pbVar2.F.addListener(new ya(pbVar2, 0));
                    pbVar2.F.setDuration(320L);
                    pbVar2.F.setInterpolator(pr.h);
                    pbVar2.F.start();
                    return;
                }
                return;
            case 3:
                pb pbVar3 = this.f3526b;
                pbVar3.f3606v0 = null;
                pbVar3.P();
                return;
            case 4:
                this.f3526b.L(true);
                return;
            case 5:
                pb pbVar4 = this.f3526b;
                pbVar4.Q();
                mb mbVar = pbVar4.f3600s0;
                ImageReceiver imageReceiver = mbVar.f3361b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = mbVar.f3362c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f3526b.m();
                return;
        }
    }
}
