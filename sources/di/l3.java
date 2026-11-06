package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;
public final class l3 implements Runnable {
    public final int f9333a;
    public final p9 f9334b;

    public l3(p9 p9Var, int i7) {
        this.f9333a = i7;
        this.f9334b = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f9333a) {
            case 0:
                this.f9334b.V();
                return;
            case 1:
                p9 p9Var = this.f9334b;
                p9Var.f9536c0 = true;
                p9Var.o(true);
                return;
            case 2:
                p9 p9Var2 = this.f9334b;
                if (p9Var2.F != null) {
                    e9 e9Var = p9Var2.f9578w;
                    if (e9Var != null) {
                        v.f9858c = true;
                        e9Var.setLayerType(2, null);
                    }
                    p9Var2.F.addListener(new y8(p9Var2, 0));
                    p9Var2.F.setDuration(320L);
                    p9Var2.F.setInterpolator(xq.h);
                    p9Var2.F.start();
                    return;
                }
                return;
            case 3:
                p9 p9Var3 = this.f9334b;
                p9Var3.f9576v0 = null;
                p9Var3.V();
                return;
            case 4:
                this.f9334b.R(true);
                return;
            case 5:
                p9 p9Var4 = this.f9334b;
                p9Var4.W();
                m9 m9Var = p9Var4.f9570s0;
                ImageReceiver imageReceiver = m9Var.f9363b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = m9Var.f9364c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f9334b.m();
                return;
        }
    }
}
