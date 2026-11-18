package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.lr;
public final class e3 implements Runnable {
    public final int f11882a;
    public final f9 f11883b;

    public e3(f9 f9Var, int i7) {
        this.f11882a = i7;
        this.f11883b = f9Var;
    }

    @Override
    public final void run() {
        switch (this.f11882a) {
            case 0:
                this.f11883b.V();
                return;
            case 1:
                f9 f9Var = this.f11883b;
                f9Var.f11964d0 = true;
                f9Var.o(true);
                return;
            case 2:
                f9 f9Var2 = this.f11883b;
                if (f9Var2.G != null) {
                    u8 u8Var = f9Var2.f12004w;
                    if (u8Var != null) {
                        v.f12629c = true;
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
                f9 f9Var3 = this.f11883b;
                f9Var3.f12005w0 = null;
                f9Var3.V();
                return;
            case 4:
                this.f11883b.R(true);
                return;
            case 5:
                f9 f9Var4 = this.f11883b;
                f9Var4.W();
                c9 c9Var = f9Var4.f11998t0;
                ImageReceiver imageReceiver = c9Var.f11820b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = c9Var.f11821c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f11883b.m();
                return;
        }
    }
}
