package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.qr;
public final class e5 implements Runnable {
    public final int f759a;
    public final jc f760b;

    public e5(jc jcVar, int i10) {
        this.f759a = i10;
        this.f760b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f759a) {
            case 0:
                this.f760b.P();
                return;
            case 1:
                jc jcVar = this.f760b;
                jcVar.f1071c0 = true;
                jcVar.n(true);
                return;
            case 2:
                jc jcVar2 = this.f760b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.f965c = true;
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
                jc jcVar3 = this.f760b;
                jcVar3.f1111v0 = null;
                jcVar3.P();
                return;
            case 4:
                this.f760b.L(true);
                return;
            case 5:
                jc jcVar4 = this.f760b;
                jcVar4.Q();
                gc gcVar = jcVar4.f1105s0;
                ImageReceiver imageReceiver = gcVar.f913b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.f914c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f760b.m();
                return;
        }
    }
}
