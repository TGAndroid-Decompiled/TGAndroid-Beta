package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18084a;
    public final org.telegram.ui.ActionBar.c2 f18085b;
    public final boolean[] f18086c;

    public x5(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.f18084a = i10;
        this.f18085b = c2Var;
        this.f18086c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18084a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18086c, this.f18085b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18085b, this.f18086c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18086c, this.f18085b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18085b, this.f18086c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f18084a = i10;
        this.f18086c = zArr;
        this.f18085b = c2Var;
    }
}
