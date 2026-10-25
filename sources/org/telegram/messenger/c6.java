package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f19755a;
    public final org.telegram.ui.ActionBar.e2 f19756b;
    public final boolean[] f19757c;

    public c6(org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, int i10) {
        this.f19755a = i10;
        this.f19756b = e2Var;
        this.f19757c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19755a) {
            case 0:
                MediaController.lambda$saveFile$48(this.f19757c, this.f19756b);
                return;
            case 1:
                MediaController.lambda$saveFile$52(this.f19756b, this.f19757c);
                return;
            case 2:
                MediaController.lambda$saveFile$57(this.f19756b, this.f19757c);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f19757c, this.f19756b);
                return;
        }
    }

    public c6(boolean[] zArr, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f19755a = i10;
        this.f19757c = zArr;
        this.f19756b = e2Var;
    }
}
