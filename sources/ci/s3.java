package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.bs;
public final class s3 implements Runnable {
    public final int f5911a;
    public final z9 f5912b;

    public s3(z9 z9Var, int i10) {
        this.f5911a = i10;
        this.f5912b = z9Var;
    }

    @Override
    public final void run() {
        switch (this.f5911a) {
            case 0:
                this.f5912b.P();
                return;
            case 1:
                z9 z9Var = this.f5912b;
                z9Var.f6227c0 = true;
                z9Var.n(true);
                return;
            case 2:
                z9 z9Var2 = this.f5912b;
                if (z9Var2.F != null) {
                    o9 o9Var = z9Var2.v;
                    if (o9Var != null) {
                        w.f6035c = true;
                        o9Var.setLayerType(2, null);
                    }
                    z9Var2.F.addListener(new i9(z9Var2, 0));
                    z9Var2.F.setDuration(320L);
                    z9Var2.F.setInterpolator(bs.h);
                    z9Var2.F.start();
                    return;
                }
                return;
            case 3:
                z9 z9Var3 = this.f5912b;
                z9Var3.f6267v0 = null;
                z9Var3.P();
                return;
            case 4:
                this.f5912b.L(true);
                return;
            case 5:
                z9 z9Var4 = this.f5912b;
                z9Var4.Q();
                w9 w9Var = z9Var4.f6261s0;
                ImageReceiver imageReceiver = w9Var.f6068b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = w9Var.f6069c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f5912b.m();
                return;
        }
    }
}
