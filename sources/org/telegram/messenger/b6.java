package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f17977a;
    public final org.telegram.ui.ActionBar.c2 f17978b;
    public final boolean[] f17979c;

    public b6(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.f17977a = i10;
        this.f17978b = c2Var;
        this.f17979c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17977a) {
            case 0:
                MediaController.lambda$saveFile$48(this.f17979c, this.f17978b);
                return;
            case 1:
                MediaController.lambda$saveFile$52(this.f17978b, this.f17979c);
                return;
            case 2:
                MediaController.lambda$saveFile$57(this.f17978b, this.f17979c);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17979c, this.f17978b);
                return;
        }
    }

    public b6(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f17977a = i10;
        this.f17979c = zArr;
        this.f17978b = c2Var;
    }
}
