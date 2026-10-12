package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17044a;
    public final org.telegram.ui.ActionBar.a2 f17045b;
    public final boolean[] f17046c;

    public a6(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f17044a = i10;
        this.f17045b = a2Var;
        this.f17046c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17044a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f17046c, this.f17045b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f17045b, this.f17046c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f17046c, this.f17045b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17045b, this.f17046c);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17044a = i10;
        this.f17046c = zArr;
        this.f17045b = a2Var;
    }
}
