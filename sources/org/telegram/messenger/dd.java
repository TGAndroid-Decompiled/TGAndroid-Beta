package org.telegram.messenger;
public final class dd implements Runnable {
    public final int f19909a;
    public final org.telegram.ui.ActionBar.r2 f19910b;

    public dd(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f19909a = i10;
        this.f19910b = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f19909a) {
            case 0:
                MessagesController.lambda$checkSensitive$452(this.f19910b);
                return;
            case 1:
                org.telegram.ui.Components.g5.s0(7, this.f19910b, null);
                return;
            case 2:
                org.telegram.ui.Components.g5.s0(8, this.f19910b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19910b);
                return;
        }
    }
}
