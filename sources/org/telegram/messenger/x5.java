package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18075a;
    public final org.telegram.ui.ActionBar.a2 f18076b;
    public final boolean[] f18077c;

    public x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f18075a = i10;
        this.f18076b = a2Var;
        this.f18077c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18075a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18077c, this.f18076b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18076b, this.f18077c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18077c, this.f18076b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18076b, this.f18077c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f18075a = i10;
        this.f18077c = zArr;
        this.f18076b = a2Var;
    }
}
