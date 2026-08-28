package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f21992a;
    public final org.telegram.ui.ActionBar.c2 f21993b;
    public final boolean[] f21994c;

    public w5(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i9) {
        this.f21992a = i9;
        this.f21993b = c2Var;
        this.f21994c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f21992a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f21994c, this.f21993b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f21993b, this.f21994c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f21994c, this.f21993b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f21993b, this.f21994c);
                return;
        }
    }

    public w5(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f21992a = i9;
        this.f21994c = zArr;
        this.f21993b = c2Var;
    }
}
