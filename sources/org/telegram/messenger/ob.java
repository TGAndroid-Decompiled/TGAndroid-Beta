package org.telegram.messenger;
public final class ob implements Runnable {
    public final int f18729a;
    public final org.telegram.ui.ActionBar.n2 f18730b;

    public ob(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f18729a = i10;
        this.f18730b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f18729a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f18730b);
                return;
            case 1:
                org.telegram.ui.Components.g5.s0(7, this.f18730b, null);
                return;
            case 2:
                org.telegram.ui.Components.g5.s0(8, this.f18730b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f18730b);
                return;
        }
    }
}
