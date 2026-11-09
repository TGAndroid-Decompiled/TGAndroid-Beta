package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;
public final class l3 implements Runnable {
    public final int f9308a;
    public final q9 f9309b;

    public l3(q9 q9Var, int i7) {
        this.f9308a = i7;
        this.f9309b = q9Var;
    }

    @Override
    public final void run() {
        switch (this.f9308a) {
            case 0:
                this.f9309b.V();
                return;
            case 1:
                q9 q9Var = this.f9309b;
                q9Var.f9601c0 = true;
                q9Var.o(true);
                return;
            case 2:
                q9 q9Var2 = this.f9309b;
                if (q9Var2.F != null) {
                    f9 f9Var = q9Var2.f9643w;
                    if (f9Var != null) {
                        v.f9851c = true;
                        f9Var.setLayerType(2, null);
                    }
                    q9Var2.F.addListener(new z8(q9Var2, 0));
                    q9Var2.F.setDuration(320L);
                    q9Var2.F.setInterpolator(xq.h);
                    q9Var2.F.start();
                    return;
                }
                return;
            case 3:
                q9 q9Var3 = this.f9309b;
                q9Var3.f9641v0 = null;
                q9Var3.V();
                return;
            case 4:
                this.f9309b.R(true);
                return;
            case 5:
                q9 q9Var4 = this.f9309b;
                q9Var4.W();
                n9 n9Var = q9Var4.f9635s0;
                ImageReceiver imageReceiver = n9Var.f9404b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = n9Var.f9405c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f9309b.m();
                return;
        }
    }
}
