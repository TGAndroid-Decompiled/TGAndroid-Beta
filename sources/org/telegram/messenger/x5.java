package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f19768a;
    public final org.telegram.ui.ActionBar.b2 f19769b;
    public final boolean[] f19770c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19768a = i10;
        this.f19769b = b2Var;
        this.f19770c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19768a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19770c, this.f19769b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19769b, this.f19770c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19770c, this.f19769b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19769b, this.f19770c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19768a = i10;
        this.f19770c = zArr;
        this.f19769b = b2Var;
    }
}
