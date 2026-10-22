package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f17914a;
    public final org.telegram.ui.ActionBar.b2 f17915b;
    public final boolean[] f17916c;

    public b6(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17914a = i10;
        this.f17915b = b2Var;
        this.f17916c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17914a) {
            case 0:
                MediaController.lambda$saveFile$48(this.f17916c, this.f17915b);
                return;
            case 1:
                MediaController.lambda$saveFile$52(this.f17915b, this.f17916c);
                return;
            case 2:
                MediaController.lambda$saveFile$57(this.f17915b, this.f17916c);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17916c, this.f17915b);
                return;
        }
    }

    public b6(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17914a = i10;
        this.f17916c = zArr;
        this.f17915b = b2Var;
    }
}
