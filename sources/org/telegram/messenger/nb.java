package org.telegram.messenger;
public final class nb implements Runnable {
    public final int f19040a;
    public final org.telegram.ui.ActionBar.n2 f19041b;

    public nb(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19040a = i10;
        this.f19041b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f19040a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f19041b);
                return;
            case 1:
                org.telegram.ui.Components.f5.s0(7, this.f19041b, null);
                return;
            case 2:
                org.telegram.ui.Components.f5.s0(8, this.f19041b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19041b);
                return;
        }
    }
}
