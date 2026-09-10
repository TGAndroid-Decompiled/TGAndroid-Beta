package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f14977a;
    public final org.telegram.ui.ActionBar.d2 f14978b;
    public final boolean[] f14979c;

    public d6(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i10) {
        this.f14977a = i10;
        this.f14978b = d2Var;
        this.f14979c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f14977a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f14979c, this.f14978b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f14978b, this.f14979c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f14979c, this.f14978b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f14978b, this.f14979c);
                return;
        }
    }

    public d6(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f14977a = i10;
        this.f14979c = zArr;
        this.f14978b = d2Var;
    }
}
