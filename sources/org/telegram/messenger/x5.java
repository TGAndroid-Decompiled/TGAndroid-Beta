package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f19770a;
    public final org.telegram.ui.ActionBar.b2 f19771b;
    public final boolean[] f19772c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19770a = i10;
        this.f19771b = b2Var;
        this.f19772c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19770a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19772c, this.f19771b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19771b, this.f19772c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19772c, this.f19771b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19771b, this.f19772c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19770a = i10;
        this.f19772c = zArr;
        this.f19771b = b2Var;
    }
}
