package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.qr;
public final class e5 implements Runnable {
    public final int f762a;
    public final jc f763b;

    public e5(jc jcVar, int i10) {
        this.f762a = i10;
        this.f763b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f762a) {
            case 0:
                this.f763b.P();
                return;
            case 1:
                jc jcVar = this.f763b;
                jcVar.f1074c0 = true;
                jcVar.n(true);
                return;
            case 2:
                jc jcVar2 = this.f763b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.f968c = true;
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
                jc jcVar3 = this.f763b;
                jcVar3.f1114v0 = null;
                jcVar3.P();
                return;
            case 4:
                this.f763b.L(true);
                return;
            case 5:
                jc jcVar4 = this.f763b;
                jcVar4.Q();
                gc gcVar = jcVar4.f1108s0;
                ImageReceiver imageReceiver = gcVar.f916b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.f917c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f763b.m();
                return;
        }
    }
}
