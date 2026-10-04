package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f19763a;
    public final org.telegram.ui.ActionBar.b2 f19764b;
    public final boolean[] f19765c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19763a = i10;
        this.f19764b = b2Var;
        this.f19765c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19763a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19765c, this.f19764b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19764b, this.f19765c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19765c, this.f19764b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19764b, this.f19765c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19763a = i10;
        this.f19765c = zArr;
        this.f19764b = b2Var;
    }
}
