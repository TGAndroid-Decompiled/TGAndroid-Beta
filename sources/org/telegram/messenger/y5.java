package org.telegram.messenger;

public final class y5 implements Runnable {

    public final int f22199a;

    public final org.telegram.ui.ActionBar.b2 f22200b;

    public final boolean[] f22201c;

    public y5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f22199a = i10;
        this.f22200b = b2Var;
        this.f22201c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f22199a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f22201c, this.f22200b);
                break;
            case 1:
                MediaController.lambda$saveFile$49(this.f22200b, this.f22201c);
                break;
            case 2:
                MediaController.lambda$saveFile$52(this.f22201c, this.f22200b);
                break;
            default:
                MediaController.lambda$saveFile$54(this.f22200b, this.f22201c);
                break;
        }
    }

    public y5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22199a = i10;
        this.f22201c = zArr;
        this.f22200b = b2Var;
    }
}
