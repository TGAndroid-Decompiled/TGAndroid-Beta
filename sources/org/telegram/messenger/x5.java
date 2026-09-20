package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18060a;
    public final org.telegram.ui.ActionBar.b2 f18061b;
    public final boolean[] f18062c;

    public x5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f18060a = i10;
        this.f18061b = b2Var;
        this.f18062c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18062c, this.f18061b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18061b, this.f18062c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18062c, this.f18061b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18061b, this.f18062c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f18060a = i10;
        this.f18062c = zArr;
        this.f18061b = b2Var;
    }
}
