package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18011a;
    public final org.telegram.ui.ActionBar.b2 f18012b;
    public final boolean[] f18013c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f18011a = i10;
        this.f18012b = b2Var;
        this.f18013c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18011a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18013c, this.f18012b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18012b, this.f18013c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18013c, this.f18012b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18012b, this.f18013c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f18011a = i10;
        this.f18013c = zArr;
        this.f18012b = b2Var;
    }
}
