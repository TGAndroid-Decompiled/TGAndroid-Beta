package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f19504a;
    public final org.telegram.ui.ActionBar.b2 f19505b;
    public final boolean[] f19506c;

    public w5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19504a = i10;
        this.f19505b = b2Var;
        this.f19506c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19504a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19506c, this.f19505b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19505b, this.f19506c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19506c, this.f19505b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19505b, this.f19506c);
                return;
        }
    }

    public w5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19504a = i10;
        this.f19506c = zArr;
        this.f19505b = b2Var;
    }
}
