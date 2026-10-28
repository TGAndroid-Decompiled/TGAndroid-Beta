package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ds;
public final class s3 implements Runnable {
    public final int f9142a;
    public final y9 f9143b;

    public s3(y9 y9Var, int i10) {
        this.f9142a = i10;
        this.f9143b = y9Var;
    }

    @Override
    public final void run() {
        switch (this.f9142a) {
            case 0:
                this.f9143b.Q();
                return;
            case 1:
                y9 y9Var = this.f9143b;
                y9Var.f9422c0 = true;
                y9Var.n(true);
                return;
            case 2:
                y9 y9Var2 = this.f9143b;
                if (y9Var2.F != null) {
                    n9 n9Var = y9Var2.v;
                    if (n9Var != null) {
                        w.f9281c = true;
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
                y9 y9Var3 = this.f9143b;
                y9Var3.f9462v0 = null;
                y9Var3.Q();
                return;
            case 4:
                this.f9143b.M(true);
                return;
            case 5:
                y9 y9Var4 = this.f9143b;
                y9Var4.R();
                v9 v9Var = y9Var4.f9456s0;
                ImageReceiver imageReceiver = v9Var.f9269b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = v9Var.f9270c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f9143b.m();
                return;
        }
    }
}
