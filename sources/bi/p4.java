package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;
public final class p4 implements Runnable {
    public final int f3498a;
    public final pb f3499b;

    public p4(pb pbVar, int i10) {
        this.f3498a = i10;
        this.f3499b = pbVar;
    }

    @Override
    public final void run() {
        switch (this.f3498a) {
            case 0:
                this.f3499b.P();
                return;
            case 1:
                pb pbVar = this.f3499b;
                pbVar.f3538c0 = true;
                pbVar.n(true);
                return;
            case 2:
                pb pbVar2 = this.f3499b;
                if (pbVar2.F != null) {
                    eb ebVar = pbVar2.v;
                    if (ebVar != null) {
                        b0.f2786c = true;
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
                pb pbVar3 = this.f3499b;
                pbVar3.f3579v0 = null;
                pbVar3.P();
                return;
            case 4:
                this.f3499b.L(true);
                return;
            case 5:
                pb pbVar4 = this.f3499b;
                pbVar4.Q();
                mb mbVar = pbVar4.f3573s0;
                ImageReceiver imageReceiver = mbVar.f3334b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = mbVar.f3335c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f3499b.m();
                return;
        }
    }
}
