package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f17830a;
    public final org.telegram.ui.ActionBar.b2 f17831b;
    public final boolean[] f17832c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17830a = i10;
        this.f17831b = b2Var;
        this.f17832c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17830a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f17832c, this.f17831b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f17831b, this.f17832c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f17832c, this.f17831b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f17831b, this.f17832c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17830a = i10;
        this.f17832c = zArr;
        this.f17831b = b2Var;
    }
}
