package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17045a;
    public final org.telegram.ui.ActionBar.a2 f17046b;
    public final boolean[] f17047c;

    public a6(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f17045a = i10;
        this.f17046b = a2Var;
        this.f17047c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17045a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f17047c, this.f17046b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f17046b, this.f17047c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f17047c, this.f17046b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17046b, this.f17047c);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17045a = i10;
        this.f17047c = zArr;
        this.f17046b = a2Var;
    }
}
