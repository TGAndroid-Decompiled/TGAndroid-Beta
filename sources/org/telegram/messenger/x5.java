package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f17829a;
    public final org.telegram.ui.ActionBar.b2 f17830b;
    public final boolean[] f17831c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17829a = i10;
        this.f17830b = b2Var;
        this.f17831c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17829a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f17831c, this.f17830b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f17830b, this.f17831c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f17831c, this.f17830b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f17830b, this.f17831c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17829a = i10;
        this.f17831c = zArr;
        this.f17830b = b2Var;
    }
}
