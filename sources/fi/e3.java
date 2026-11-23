package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.kr;
public final class e3 implements Runnable {
    public final int f11885a;
    public final f9 f11886b;

    public e3(f9 f9Var, int i7) {
        this.f11885a = i7;
        this.f11886b = f9Var;
    }

    @Override
    public final void run() {
        switch (this.f11885a) {
            case 0:
                this.f11886b.V();
                return;
            case 1:
                f9 f9Var = this.f11886b;
                f9Var.f11967d0 = true;
                f9Var.o(true);
                return;
            case 2:
                f9 f9Var2 = this.f11886b;
                if (f9Var2.G != null) {
                    u8 u8Var = f9Var2.f12007w;
                    if (u8Var != null) {
                        v.f12635c = true;
                        u8Var.setLayerType(2, null);
                    }
                    f9Var2.G.addListener(new o8(f9Var2, 0));
                    f9Var2.G.setDuration(320L);
                    f9Var2.G.setInterpolator(kr.h);
                    f9Var2.G.start();
                    return;
                }
                return;
            case 3:
                f9 f9Var3 = this.f11886b;
                f9Var3.f12008w0 = null;
                f9Var3.V();
                return;
            case 4:
                this.f11886b.R(true);
                return;
            case 5:
                f9 f9Var4 = this.f11886b;
                f9Var4.W();
                c9 c9Var = f9Var4.f12001t0;
                ImageReceiver imageReceiver = c9Var.f11822b;
                if (imageReceiver != null) {
                    imageReceiver.P0(false, true);
                }
                ImageReceiver imageReceiver2 = c9Var.f11823c;
                if (imageReceiver2 != null) {
                    imageReceiver2.P0(false, true);
                    return;
                }
                return;
            default:
                this.f11886b.m();
                return;
        }
    }
}
