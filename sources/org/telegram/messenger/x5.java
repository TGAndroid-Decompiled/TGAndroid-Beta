package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18099a;
    public final org.telegram.ui.ActionBar.a2 f18100b;
    public final boolean[] f18101c;

    public x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f18099a = i10;
        this.f18100b = a2Var;
        this.f18101c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18099a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18101c, this.f18100b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18100b, this.f18101c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18101c, this.f18100b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18100b, this.f18101c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f18099a = i10;
        this.f18101c = zArr;
        this.f18100b = a2Var;
    }
}
