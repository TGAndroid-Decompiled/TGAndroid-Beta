package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f19771a;
    public final org.telegram.ui.ActionBar.b2 f19772b;
    public final boolean[] f19773c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19771a = i10;
        this.f19772b = b2Var;
        this.f19773c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19771a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19773c, this.f19772b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19772b, this.f19773c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19773c, this.f19772b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19772b, this.f19773c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19771a = i10;
        this.f19773c = zArr;
        this.f19772b = b2Var;
    }
}
