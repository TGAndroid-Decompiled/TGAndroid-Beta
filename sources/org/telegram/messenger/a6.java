package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17842a;
    public final org.telegram.ui.ActionBar.b2 f17843b;
    public final boolean[] f17844c;

    public a6(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17842a = i10;
        this.f17843b = b2Var;
        this.f17844c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17842a) {
            case 0:
                MediaController.lambda$saveFile$48(this.f17844c, this.f17843b);
                return;
            case 1:
                MediaController.lambda$saveFile$52(this.f17843b, this.f17844c);
                return;
            case 2:
                MediaController.lambda$saveFile$57(this.f17843b, this.f17844c);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17844c, this.f17843b);
                return;
        }
    }

    public a6(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17842a = i10;
        this.f17844c = zArr;
        this.f17843b = b2Var;
    }
}
