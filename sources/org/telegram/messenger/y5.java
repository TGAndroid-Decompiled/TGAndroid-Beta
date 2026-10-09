package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19871a;
    public final org.telegram.ui.ActionBar.b2 f19872b;
    public final boolean[] f19873c;

    public y5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19871a = i10;
        this.f19872b = b2Var;
        this.f19873c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19871a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19873c, this.f19872b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19872b, this.f19873c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19873c, this.f19872b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19872b, this.f19873c);
                return;
        }
    }

    public y5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19871a = i10;
        this.f19873c = zArr;
        this.f19872b = b2Var;
    }
}
