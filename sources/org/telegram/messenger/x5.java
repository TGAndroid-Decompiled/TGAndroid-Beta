package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f17839a;
    public final org.telegram.ui.ActionBar.c2 f17840b;
    public final boolean[] f17841c;

    public x5(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.f17839a = i10;
        this.f17840b = c2Var;
        this.f17841c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17839a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f17841c, this.f17840b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f17840b, this.f17841c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f17841c, this.f17840b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f17840b, this.f17841c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f17839a = i10;
        this.f17841c = zArr;
        this.f17840b = c2Var;
    }
}
