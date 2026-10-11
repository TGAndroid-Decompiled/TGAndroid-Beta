package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19902a;
    public final org.telegram.ui.ActionBar.a2 f19903b;
    public final boolean[] f19904c;

    public y5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f19902a = i10;
        this.f19903b = a2Var;
        this.f19904c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19902a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19904c, this.f19903b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19903b, this.f19904c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19904c, this.f19903b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19903b, this.f19904c);
                return;
        }
    }

    public y5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f19902a = i10;
        this.f19904c = zArr;
        this.f19903b = a2Var;
    }
}
