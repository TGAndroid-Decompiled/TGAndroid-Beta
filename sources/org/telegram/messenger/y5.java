package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19875a;
    public final org.telegram.ui.ActionBar.b2 f19876b;
    public final boolean[] f19877c;

    public y5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19875a = i10;
        this.f19876b = b2Var;
        this.f19877c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19875a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19877c, this.f19876b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19876b, this.f19877c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19877c, this.f19876b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19876b, this.f19877c);
                return;
        }
    }

    public y5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19875a = i10;
        this.f19877c = zArr;
        this.f19876b = b2Var;
    }
}
