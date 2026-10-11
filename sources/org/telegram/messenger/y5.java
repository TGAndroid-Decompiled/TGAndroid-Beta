package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19866a;
    public final org.telegram.ui.ActionBar.a2 f19867b;
    public final boolean[] f19868c;

    public y5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f19866a = i10;
        this.f19867b = a2Var;
        this.f19868c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19866a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19868c, this.f19867b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19867b, this.f19868c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19868c, this.f19867b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19867b, this.f19868c);
                return;
        }
    }

    public y5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f19866a = i10;
        this.f19868c = zArr;
        this.f19867b = a2Var;
    }
}
