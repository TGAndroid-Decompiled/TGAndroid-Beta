package nh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.mr;
public final class k3 implements Runnable {
    public final int f15512a;
    public final i9 f15513b;

    public k3(i9 i9Var, int i10) {
        this.f15512a = i10;
        this.f15513b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f15512a) {
            case 0:
                this.f15513b.P();
                return;
            case 1:
                i9 i9Var = this.f15513b;
                i9Var.Z = true;
                i9Var.n(true);
                return;
            case 2:
                i9 i9Var2 = this.f15513b;
                if (i9Var2.C != null) {
                    x8 x8Var = i9Var2.v;
                    if (x8Var != null) {
                        u.f15925c = true;
                        x8Var.setLayerType(2, null);
                    }
                    i9Var2.C.addListener(new r8(i9Var2, 0));
                    i9Var2.C.setDuration(320L);
                    i9Var2.C.setInterpolator(mr.h);
                    i9Var2.C.start();
                    return;
                }
                return;
            case 3:
                i9 i9Var3 = this.f15513b;
                i9Var3.f15469s0 = null;
                i9Var3.P();
                return;
            case 4:
                this.f15513b.L(true);
                return;
            case 5:
                i9 i9Var4 = this.f15513b;
                i9Var4.Q();
                f9 f9Var = i9Var4.f15461p0;
                ImageReceiver imageReceiver = f9Var.f15313b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = f9Var.f15314c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f15513b.m();
                return;
        }
    }
}
