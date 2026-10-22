package org.telegram.messenger;
public final class rb implements Runnable {
    public final int f19378a;
    public final org.telegram.ui.ActionBar.n2 f19379b;

    public rb(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19378a = i10;
        this.f19379b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f19378a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f19379b);
                return;
            case 1:
                org.telegram.ui.Components.f5.s0(7, this.f19379b, null);
                return;
            case 2:
                org.telegram.ui.Components.f5.s0(8, this.f19379b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19379b);
                return;
        }
    }
}
