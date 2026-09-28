package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18098a;
    public final org.telegram.ui.ActionBar.a2 f18099b;
    public final boolean[] f18100c;

    public x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f18098a = i10;
        this.f18099b = a2Var;
        this.f18100c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18098a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18100c, this.f18099b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18099b, this.f18100c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18100c, this.f18099b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18099b, this.f18100c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f18098a = i10;
        this.f18100c = zArr;
        this.f18099b = a2Var;
    }
}
