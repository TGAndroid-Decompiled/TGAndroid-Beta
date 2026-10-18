package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.bs;
public final class t3 implements Runnable {
    public final int f6005a;
    public final aa f6006b;

    public t3(aa aaVar, int i10) {
        this.f6005a = i10;
        this.f6006b = aaVar;
    }

    @Override
    public final void run() {
        switch (this.f6005a) {
            case 0:
                this.f6006b.P();
                return;
            case 1:
                aa aaVar = this.f6006b;
                aaVar.f5184c0 = true;
                aaVar.n(true);
                return;
            case 2:
                aa aaVar2 = this.f6006b;
                if (aaVar2.F != null) {
                    p9 p9Var = aaVar2.v;
                    if (p9Var != null) {
                        w.f6098c = true;
                        p9Var.setLayerType(2, null);
                    }
                    aaVar2.F.addListener(new j9(aaVar2, 0));
                    aaVar2.F.setDuration(320L);
                    aaVar2.F.setInterpolator(bs.h);
                    aaVar2.F.start();
                    return;
                }
                return;
            case 3:
                aa aaVar3 = this.f6006b;
                aaVar3.f5224v0 = null;
                aaVar3.P();
                return;
            case 4:
                this.f6006b.L(true);
                return;
            case 5:
                aa aaVar4 = this.f6006b;
                aaVar4.Q();
                x9 x9Var = aaVar4.f5218s0;
                ImageReceiver imageReceiver = x9Var.f6176b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = x9Var.f6177c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f6006b.m();
                return;
        }
    }
}
