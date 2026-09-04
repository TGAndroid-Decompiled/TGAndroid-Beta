package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f19552a;
    public final org.telegram.ui.ActionBar.b2 f19553b;
    public final boolean[] f19554c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19552a = i10;
        this.f19553b = b2Var;
        this.f19554c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19552a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19554c, this.f19553b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19553b, this.f19554c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19554c, this.f19553b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19553b, this.f19554c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19552a = i10;
        this.f19554c = zArr;
        this.f19553b = b2Var;
    }
}
