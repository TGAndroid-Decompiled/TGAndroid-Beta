package jh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;

public final class l3 implements Runnable {

    public final int f13612a;

    public final i9 f13613b;

    public l3(i9 i9Var, int i10) {
        this.f13612a = i10;
        this.f13613b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f13612a) {
            case 0:
                this.f13613b.P();
                break;
            case 1:
                i9 i9Var = this.f13613b;
                i9Var.Y = true;
                i9Var.n(true);
                break;
            case 2:
                i9 i9Var2 = this.f13613b;
                if (i9Var2.B != null) {
                    x8 x8Var = i9Var2.v;
                    if (x8Var != null) {
                        t.f13983c = true;
                        x8Var.setLayerType(2, null);
                    }
                    i9Var2.B.addListener(new r8(i9Var2, 0));
                    i9Var2.B.setDuration(320L);
                    i9Var2.B.setInterpolator(er.h);
                    i9Var2.B.start();
                    break;
                }
                break;
            case 3:
                i9 i9Var3 = this.f13613b;
                i9Var3.f13503r0 = null;
                i9Var3.P();
                break;
            case 4:
                this.f13613b.L(true);
                break;
            case 5:
                i9 i9Var4 = this.f13613b;
                i9Var4.Q();
                f9 f9Var = i9Var4.f13496o0;
                ImageReceiver imageReceiver = f9Var.f13334b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = f9Var.f13335c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                }
                break;
            default:
                this.f13613b.m();
                break;
        }
    }
}
