package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.tr;
public final class d5 implements Runnable {
    public final int f770a;
    public final jc f771b;

    public d5(jc jcVar, int i10) {
        this.f770a = i10;
        this.f771b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f770a) {
            case 0:
                this.f771b.P();
                return;
            case 1:
                jc jcVar = this.f771b;
                jcVar.f1151c0 = true;
                jcVar.n(true);
                return;
            case 2:
                jc jcVar2 = this.f771b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.f1058c = true;
                        ybVar.setLayerType(2, null);
                    }
                    jcVar2.F.addListener(new sb(jcVar2, 0));
                    jcVar2.F.setDuration(320L);
                    jcVar2.F.setInterpolator(tr.h);
                    jcVar2.F.start();
                    return;
                }
                return;
            case 3:
                jc jcVar3 = this.f771b;
                jcVar3.f1192v0 = null;
                jcVar3.P();
                return;
            case 4:
                this.f771b.L(true);
                return;
            case 5:
                jc jcVar4 = this.f771b;
                jcVar4.Q();
                gc gcVar = jcVar4.f1186s0;
                ImageReceiver imageReceiver = gcVar.f990b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.f991c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f771b.m();
                return;
        }
    }
}
