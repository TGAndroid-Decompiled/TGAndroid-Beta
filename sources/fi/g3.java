package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;
public final class g3 implements Runnable {
    public final int f11734a;
    public final i9 f11735b;

    public g3(i9 i9Var, int i7) {
        this.f11734a = i7;
        this.f11735b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f11734a) {
            case 0:
                this.f11735b.V();
                return;
            case 1:
                i9 i9Var = this.f11735b;
                i9Var.f11839d0 = true;
                i9Var.o(true);
                return;
            case 2:
                i9 i9Var2 = this.f11735b;
                if (i9Var2.G != null) {
                    x8 x8Var = i9Var2.f11879w;
                    if (x8Var != null) {
                        v.f12407c = true;
                        x8Var.setLayerType(2, null);
                    }
                    i9Var2.G.addListener(new r8(i9Var2, 0));
                    i9Var2.G.setDuration(320L);
                    i9Var2.G.setInterpolator(er.h);
                    i9Var2.G.start();
                    return;
                }
                return;
            case 3:
                i9 i9Var3 = this.f11735b;
                i9Var3.f11880w0 = null;
                i9Var3.V();
                return;
            case 4:
                this.f11735b.R(true);
                return;
            case 5:
                i9 i9Var4 = this.f11735b;
                i9Var4.W();
                f9 f9Var = i9Var4.f11873t0;
                ImageReceiver imageReceiver = f9Var.f11711b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = f9Var.f11712c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f11735b.m();
                return;
        }
    }
}
