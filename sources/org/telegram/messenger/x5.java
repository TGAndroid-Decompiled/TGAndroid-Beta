package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18114a;
    public final org.telegram.ui.ActionBar.a2 f18115b;
    public final boolean[] f18116c;

    public x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f18114a = i10;
        this.f18115b = a2Var;
        this.f18116c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18114a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18116c, this.f18115b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18115b, this.f18116c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18116c, this.f18115b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18115b, this.f18116c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f18114a = i10;
        this.f18116c = zArr;
        this.f18115b = a2Var;
    }
}
