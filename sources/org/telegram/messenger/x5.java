package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f19579a;
    public final org.telegram.ui.ActionBar.b2 f19580b;
    public final boolean[] f19581c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19579a = i10;
        this.f19580b = b2Var;
        this.f19581c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19579a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19581c, this.f19580b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19580b, this.f19581c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19581c, this.f19580b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19580b, this.f19581c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19579a = i10;
        this.f19581c = zArr;
        this.f19580b = b2Var;
    }
}
