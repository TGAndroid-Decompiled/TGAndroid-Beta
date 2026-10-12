package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.js;
public final class e5 implements Runnable {
    public final int f878a;
    public final kc f879b;

    public e5(kc kcVar, int i10) {
        this.f878a = i10;
        this.f879b = kcVar;
    }

    @Override
    public final void run() {
        switch (this.f878a) {
            case 0:
                this.f879b.P();
                return;
            case 1:
                kc kcVar = this.f879b;
                kcVar.f1258c0 = true;
                kcVar.n(true);
                return;
            case 2:
                kc kcVar2 = this.f879b;
                if (kcVar2.F != null) {
                    zb zbVar = kcVar2.v;
                    if (zbVar != null) {
                        i0.f1118c = true;
                        zbVar.setLayerType(2, null);
                    }
                    kcVar2.F.addListener(new tb(kcVar2, 0));
                    kcVar2.F.setDuration(320L);
                    kcVar2.F.setInterpolator(js.h);
                    kcVar2.F.start();
                    return;
                }
                return;
            case 3:
                kc kcVar3 = this.f879b;
                kcVar3.f1299v0 = null;
                kcVar3.P();
                return;
            case 4:
                this.f879b.L(true);
                return;
            case 5:
                kc kcVar4 = this.f879b;
                kcVar4.Q();
                hc hcVar = kcVar4.f1293s0;
                ImageReceiver imageReceiver = hcVar.f1104b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = hcVar.f1105c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f879b.m();
                return;
        }
    }
}
