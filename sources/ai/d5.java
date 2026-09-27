package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.sr;
public final class d5 implements Runnable {
    public final int f712a;
    public final jc f713b;

    public d5(jc jcVar, int i10) {
        this.f712a = i10;
        this.f713b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f712a) {
            case 0:
                this.f713b.P();
                return;
            case 1:
                jc jcVar = this.f713b;
                jcVar.f1067c0 = true;
                jcVar.n(true);
                return;
            case 2:
                jc jcVar2 = this.f713b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.f978c = true;
                        ybVar.setLayerType(2, null);
                    }
                    jcVar2.F.addListener(new sb(jcVar2, 0));
                    jcVar2.F.setDuration(320L);
                    jcVar2.F.setInterpolator(sr.h);
                    jcVar2.F.start();
                    return;
                }
                return;
            case 3:
                jc jcVar3 = this.f713b;
                jcVar3.f1107v0 = null;
                jcVar3.P();
                return;
            case 4:
                this.f713b.L(true);
                return;
            case 5:
                jc jcVar4 = this.f713b;
                jcVar4.Q();
                gc gcVar = jcVar4.f1101s0;
                ImageReceiver imageReceiver = gcVar.f917b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.f918c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f713b.m();
                return;
        }
    }
}
