package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.rr;
public final class d5 implements Runnable {
    public final int f709a;
    public final jc f710b;

    public d5(jc jcVar, int i10) {
        this.f709a = i10;
        this.f710b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f709a) {
            case 0:
                this.f710b.P();
                return;
            case 1:
                jc jcVar = this.f710b;
                jcVar.f1065c0 = true;
                jcVar.n(true);
                return;
            case 2:
                jc jcVar2 = this.f710b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.f975c = true;
                        ybVar.setLayerType(2, null);
                    }
                    jcVar2.F.addListener(new sb(jcVar2, 0));
                    jcVar2.F.setDuration(320L);
                    jcVar2.F.setInterpolator(rr.h);
                    jcVar2.F.start();
                    return;
                }
                return;
            case 3:
                jc jcVar3 = this.f710b;
                jcVar3.f1105v0 = null;
                jcVar3.P();
                return;
            case 4:
                this.f710b.L(true);
                return;
            case 5:
                jc jcVar4 = this.f710b;
                jcVar4.Q();
                gc gcVar = jcVar4.f1099s0;
                ImageReceiver imageReceiver = gcVar.f914b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.f915c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f710b.m();
                return;
        }
    }
}
