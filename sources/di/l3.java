package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.wq;
public final class l3 implements Runnable {
    public final int f9313a;
    public final q9 f9314b;

    public l3(q9 q9Var, int i7) {
        this.f9313a = i7;
        this.f9314b = q9Var;
    }

    @Override
    public final void run() {
        switch (this.f9313a) {
            case 0:
                this.f9314b.V();
                return;
            case 1:
                q9 q9Var = this.f9314b;
                q9Var.f9606c0 = true;
                q9Var.o(true);
                return;
            case 2:
                q9 q9Var2 = this.f9314b;
                if (q9Var2.F != null) {
                    f9 f9Var = q9Var2.f9648w;
                    if (f9Var != null) {
                        v.f9856c = true;
                        f9Var.setLayerType(2, null);
                    }
                    q9Var2.F.addListener(new z8(q9Var2, 0));
                    q9Var2.F.setDuration(320L);
                    q9Var2.F.setInterpolator(wq.h);
                    q9Var2.F.start();
                    return;
                }
                return;
            case 3:
                q9 q9Var3 = this.f9314b;
                q9Var3.f9646v0 = null;
                q9Var3.V();
                return;
            case 4:
                this.f9314b.R(true);
                return;
            case 5:
                q9 q9Var4 = this.f9314b;
                q9Var4.W();
                n9 n9Var = q9Var4.f9640s0;
                ImageReceiver imageReceiver = n9Var.f9409b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = n9Var.f9410c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f9314b.m();
                return;
        }
    }
}
