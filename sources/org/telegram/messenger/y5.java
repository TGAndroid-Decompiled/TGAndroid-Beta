package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f22225a;
    public final org.telegram.ui.ActionBar.c2 f22226b;
    public final boolean[] f22227c;

    public y5(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.f22225a = i10;
        this.f22226b = c2Var;
        this.f22227c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f22225a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f22227c, this.f22226b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f22226b, this.f22227c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f22227c, this.f22226b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f22226b, this.f22227c);
                return;
        }
    }

    public y5(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f22225a = i10;
        this.f22227c = zArr;
        this.f22226b = c2Var;
    }
}
