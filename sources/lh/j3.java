package lh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.jr;
public final class j3 implements Runnable {
    public final int f15802a;
    public final i9 f15803b;

    public j3(i9 i9Var, int i10) {
        this.f15802a = i10;
        this.f15803b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f15802a) {
            case 0:
                this.f15803b.P();
                return;
            case 1:
                i9 i9Var = this.f15803b;
                i9Var.Y = true;
                i9Var.n(true);
                return;
            case 2:
                i9 i9Var2 = this.f15803b;
                if (i9Var2.B != null) {
                    x8 x8Var = i9Var2.v;
                    if (x8Var != null) {
                        t.f16248c = true;
                        x8Var.setLayerType(2, null);
                    }
                    i9Var2.B.addListener(new r8(i9Var2, 0));
                    i9Var2.B.setDuration(320L);
                    i9Var2.B.setInterpolator(jr.h);
                    i9Var2.B.start();
                    return;
                }
                return;
            case 3:
                i9 i9Var3 = this.f15803b;
                i9Var3.f15781r0 = null;
                i9Var3.P();
                return;
            case 4:
                this.f15803b.L(true);
                return;
            case 5:
                i9 i9Var4 = this.f15803b;
                i9Var4.Q();
                f9 f9Var = i9Var4.f15774o0;
                ImageReceiver imageReceiver = f9Var.f15602b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = f9Var.f15603c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f15803b.m();
                return;
        }
    }
}
