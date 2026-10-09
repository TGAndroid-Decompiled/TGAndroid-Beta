package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.hs;
public final class e5 implements Runnable {
    public final int f880a;
    public final kc f881b;

    public e5(kc kcVar, int i10) {
        this.f880a = i10;
        this.f881b = kcVar;
    }

    @Override
    public final void run() {
        switch (this.f880a) {
            case 0:
                this.f881b.P();
                return;
            case 1:
                kc kcVar = this.f881b;
                kcVar.f1260c0 = true;
                kcVar.n(true);
                return;
            case 2:
                kc kcVar2 = this.f881b;
                if (kcVar2.F != null) {
                    zb zbVar = kcVar2.v;
                    if (zbVar != null) {
                        i0.f1120c = true;
                        zbVar.setLayerType(2, null);
                    }
                    kcVar2.F.addListener(new tb(kcVar2, 0));
                    kcVar2.F.setDuration(320L);
                    kcVar2.F.setInterpolator(hs.h);
                    kcVar2.F.start();
                    return;
                }
                return;
            case 3:
                kc kcVar3 = this.f881b;
                kcVar3.f1301v0 = null;
                kcVar3.P();
                return;
            case 4:
                this.f881b.L(true);
                return;
            case 5:
                kc kcVar4 = this.f881b;
                kcVar4.Q();
                hc hcVar = kcVar4.f1295s0;
                ImageReceiver imageReceiver = hcVar.f1106b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = hcVar.f1107c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f881b.m();
                return;
        }
    }
}
