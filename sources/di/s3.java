package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ds;
public final class s3 implements Runnable {
    public final int f9143a;
    public final y9 f9144b;

    public s3(y9 y9Var, int i10) {
        this.f9143a = i10;
        this.f9144b = y9Var;
    }

    @Override
    public final void run() {
        switch (this.f9143a) {
            case 0:
                this.f9144b.P();
                return;
            case 1:
                y9 y9Var = this.f9144b;
                y9Var.f9423c0 = true;
                y9Var.n(true);
                return;
            case 2:
                y9 y9Var2 = this.f9144b;
                if (y9Var2.F != null) {
                    n9 n9Var = y9Var2.v;
                    if (n9Var != null) {
                        w.f9282c = true;
                        n9Var.setLayerType(2, null);
                    }
                    y9Var2.F.addListener(new h9(y9Var2, 0));
                    y9Var2.F.setDuration(320L);
                    y9Var2.F.setInterpolator(ds.h);
                    y9Var2.F.start();
                    return;
                }
                return;
            case 3:
                y9 y9Var3 = this.f9144b;
                y9Var3.f9463v0 = null;
                y9Var3.P();
                return;
            case 4:
                this.f9144b.L(true);
                return;
            case 5:
                y9 y9Var4 = this.f9144b;
                y9Var4.Q();
                v9 v9Var = y9Var4.f9457s0;
                ImageReceiver imageReceiver = v9Var.f9270b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = v9Var.f9271c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f9144b.m();
                return;
        }
    }
}
