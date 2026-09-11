package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f19477a;
    public final org.telegram.ui.ActionBar.b2 f19478b;
    public final boolean[] f19479c;

    public w5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f19477a = i10;
        this.f19478b = b2Var;
        this.f19479c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19477a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19479c, this.f19478b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19478b, this.f19479c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19479c, this.f19478b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19478b, this.f19479c);
                return;
        }
    }

    public w5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19477a = i10;
        this.f19479c = zArr;
        this.f19478b = b2Var;
    }
}
