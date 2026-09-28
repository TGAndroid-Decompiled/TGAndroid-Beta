package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18097a;
    public final org.telegram.ui.ActionBar.a2 f18098b;
    public final boolean[] f18099c;

    public x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f18097a = i10;
        this.f18098b = a2Var;
        this.f18099c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18097a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f18099c, this.f18098b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f18098b, this.f18099c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f18099c, this.f18098b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f18098b, this.f18099c);
                return;
        }
    }

    public x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f18097a = i10;
        this.f18099c = zArr;
        this.f18098b = a2Var;
    }
}
