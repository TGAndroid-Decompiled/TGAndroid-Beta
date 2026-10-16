package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f16442a;
    public final org.telegram.ui.ActionBar.a2 f16443b;
    public final boolean[] f16444c;

    public a6(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.f16442a = i10;
        this.f16443b = a2Var;
        this.f16444c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16442a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f16444c, this.f16443b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f16443b, this.f16444c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f16444c, this.f16443b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f16443b, this.f16444c);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16442a = i10;
        this.f16444c = zArr;
        this.f16443b = a2Var;
    }
}
