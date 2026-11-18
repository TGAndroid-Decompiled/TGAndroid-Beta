package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.lr;
public final class e3 implements Runnable {
    public final int f11879a;
    public final f9 f11880b;

    public e3(f9 f9Var, int i7) {
        this.f11879a = i7;
        this.f11880b = f9Var;
    }

    @Override
    public final void run() {
        switch (this.f11879a) {
            case 0:
                this.f11880b.V();
                return;
            case 1:
                f9 f9Var = this.f11880b;
                f9Var.f11961d0 = true;
                f9Var.o(true);
                return;
            case 2:
                f9 f9Var2 = this.f11880b;
                if (f9Var2.G != null) {
                    u8 u8Var = f9Var2.f12001w;
                    if (u8Var != null) {
                        v.f12626c = true;
                        u8Var.setLayerType(2, null);
                    }
                    f9Var2.G.addListener(new o8(f9Var2, 0));
                    f9Var2.G.setDuration(320L);
                    f9Var2.G.setInterpolator(lr.h);
                    f9Var2.G.start();
                    return;
                }
                return;
            case 3:
                f9 f9Var3 = this.f11880b;
                f9Var3.f12002w0 = null;
                f9Var3.V();
                return;
            case 4:
                this.f11880b.R(true);
                return;
            case 5:
                f9 f9Var4 = this.f11880b;
                f9Var4.W();
                c9 c9Var = f9Var4.f11995t0;
                ImageReceiver imageReceiver = c9Var.f11817b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = c9Var.f11818c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f11880b.m();
                return;
        }
    }
}
