package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f19877a;
    public final org.telegram.ui.ActionBar.e2 f19878b;
    public final boolean[] f19879c;

    public d6(org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, int i10) {
        this.f19877a = i10;
        this.f19878b = e2Var;
        this.f19879c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19877a) {
            case 0:
                MediaController.lambda$saveFile$48(this.f19879c, this.f19878b);
                return;
            case 1:
                MediaController.lambda$saveFile$52(this.f19878b, this.f19879c);
                return;
            case 2:
                MediaController.lambda$saveFile$57(this.f19878b, this.f19879c);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f19879c, this.f19878b);
                return;
        }
    }

    public d6(boolean[] zArr, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f19877a = i10;
        this.f19879c = zArr;
        this.f19878b = e2Var;
    }
}
