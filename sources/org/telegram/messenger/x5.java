package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18090a;
    public final org.telegram.ui.ActionBar.a2 f18091b;
    public final boolean[] f18092c;

    public x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f18090a = i10;
        this.f18091b = a2Var;
        this.f18092c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18090a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18092c, this.f18091b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18091b, this.f18092c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18092c, this.f18091b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18091b, this.f18092c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f18090a = i10;
        this.f18092c = zArr;
        this.f18091b = a2Var;
    }
}
