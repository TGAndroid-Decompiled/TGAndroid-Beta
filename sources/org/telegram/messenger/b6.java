package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f17930a;
    public final org.telegram.ui.ActionBar.b2 f17931b;
    public final boolean[] f17932c;

    public b6(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f17930a = i10;
        this.f17931b = b2Var;
        this.f17932c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17930a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f17932c, this.f17931b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f17931b, this.f17932c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f17932c, this.f17931b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f17931b, this.f17932c);
                return;
        }
    }

    public b6(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17930a = i10;
        this.f17932c = zArr;
        this.f17931b = b2Var;
    }
}
