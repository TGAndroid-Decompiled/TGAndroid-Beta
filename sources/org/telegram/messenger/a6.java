package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17843a;
    public final org.telegram.ui.ActionBar.b2 f17844b;
    public final boolean[] f17845c;

    public a6(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17843a = i10;
        this.f17844b = b2Var;
        this.f17845c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17843a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f17845c, this.f17844b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f17844b, this.f17845c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f17845c, this.f17844b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17844b, this.f17845c);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17843a = i10;
        this.f17845c = zArr;
        this.f17844b = b2Var;
    }
}
