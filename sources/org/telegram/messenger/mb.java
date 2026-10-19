package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18961a;
    public final org.telegram.ui.ActionBar.n2 f18962b;

    public mb(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f18961a = i10;
        this.f18962b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f18961a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f18962b);
                return;
            case 1:
                org.telegram.ui.Components.f5.s0(7, this.f18962b, null);
                return;
            case 2:
                org.telegram.ui.Components.f5.s0(8, this.f18962b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f18962b);
                return;
        }
    }
}
