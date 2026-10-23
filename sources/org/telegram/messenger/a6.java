package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17905a;
    public final org.telegram.ui.ActionBar.c2 f17906b;
    public final boolean[] f17907c;

    public a6(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.f17905a = i10;
        this.f17906b = c2Var;
        this.f17907c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17905a) {
            case 0:
                MediaController.lambda$saveFile$48(this.f17907c, this.f17906b);
                return;
            case 1:
                MediaController.lambda$saveFile$52(this.f17906b, this.f17907c);
                return;
            case 2:
                MediaController.lambda$saveFile$57(this.f17906b, this.f17907c);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17907c, this.f17906b);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f17905a = i10;
        this.f17907c = zArr;
        this.f17906b = c2Var;
    }
}
