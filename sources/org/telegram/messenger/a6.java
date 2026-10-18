package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17840a;
    public final org.telegram.ui.ActionBar.b2 f17841b;
    public final boolean[] f17842c;

    public a6(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17840a = i10;
        this.f17841b = b2Var;
        this.f17842c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17840a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f17842c, this.f17841b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f17841b, this.f17842c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f17842c, this.f17841b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17841b, this.f17842c);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17840a = i10;
        this.f17842c = zArr;
        this.f17841b = b2Var;
    }
}
