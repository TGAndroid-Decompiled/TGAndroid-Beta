package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.bs;
public final class t3 implements Runnable {
    public final int f6002a;
    public final aa f6003b;

    public t3(aa aaVar, int i10) {
        this.f6002a = i10;
        this.f6003b = aaVar;
    }

    @Override
    public final void run() {
        switch (this.f6002a) {
            case 0:
                this.f6003b.P();
                return;
            case 1:
                aa aaVar = this.f6003b;
                aaVar.f5181c0 = true;
                aaVar.n(true);
                return;
            case 2:
                aa aaVar2 = this.f6003b;
                if (aaVar2.F != null) {
                    p9 p9Var = aaVar2.v;
                    if (p9Var != null) {
                        w.f6095c = true;
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
                aa aaVar3 = this.f6003b;
                aaVar3.f5221v0 = null;
                aaVar3.P();
                return;
            case 4:
                this.f6003b.L(true);
                return;
            case 5:
                aa aaVar4 = this.f6003b;
                aaVar4.Q();
                x9 x9Var = aaVar4.f5215s0;
                ImageReceiver imageReceiver = x9Var.f6173b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = x9Var.f6174c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f6003b.m();
                return;
        }
    }
}
