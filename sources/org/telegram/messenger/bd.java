package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f19702a;
    public final org.telegram.ui.ActionBar.r2 f19703b;

    public bd(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f19702a = i10;
        this.f19703b = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f19702a) {
            case 0:
                MessagesController.lambda$checkSensitive$453(this.f19703b);
                return;
            case 1:
                org.telegram.ui.Components.g5.s0(7, this.f19703b, null);
                return;
            case 2:
                org.telegram.ui.Components.g5.s0(8, this.f19703b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19703b);
                return;
        }
    }
}
