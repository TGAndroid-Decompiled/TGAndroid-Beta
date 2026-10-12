package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f16748a;
    public final org.telegram.ui.ActionBar.a2 f16749b;
    public final boolean[] f16750c;

    public a6(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f16748a = i10;
        this.f16749b = a2Var;
        this.f16750c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16748a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f16750c, this.f16749b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f16749b, this.f16750c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f16750c, this.f16749b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f16749b, this.f16750c);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16748a = i10;
        this.f16750c = zArr;
        this.f16749b = a2Var;
    }
}
