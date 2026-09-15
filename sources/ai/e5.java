package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.qr;
public final class e5 implements Runnable {
    public final int f757a;
    public final jc f758b;

    public e5(jc jcVar, int i10) {
        this.f757a = i10;
        this.f758b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f757a) {
            case 0:
                this.f758b.P();
                return;
            case 1:
                jc jcVar = this.f758b;
                jcVar.f1069c0 = true;
                jcVar.n(true);
                return;
            case 2:
                jc jcVar2 = this.f758b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.f963c = true;
                        ybVar.setLayerType(2, null);
                    }
                    jcVar2.F.addListener(new sb(jcVar2, 0));
                    jcVar2.F.setDuration(320L);
                    jcVar2.F.setInterpolator(qr.h);
                    jcVar2.F.start();
                    return;
                }
                return;
            case 3:
                jc jcVar3 = this.f758b;
                jcVar3.f1109v0 = null;
                jcVar3.P();
                return;
            case 4:
                this.f758b.L(true);
                return;
            case 5:
                jc jcVar4 = this.f758b;
                jcVar4.Q();
                gc gcVar = jcVar4.f1103s0;
                ImageReceiver imageReceiver = gcVar.f911b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.f912c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f758b.m();
                return;
        }
    }
}
