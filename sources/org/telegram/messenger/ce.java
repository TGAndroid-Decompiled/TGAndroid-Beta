package org.telegram.messenger;
public final class ce implements Runnable {
    public final int f14915a;
    public final org.telegram.ui.ActionBar.p2 f14916b;

    public ce(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f14915a = i10;
        this.f14916b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f14915a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f14916b);
                return;
            case 1:
                org.telegram.ui.Components.d5.t0(7, this.f14916b, null);
                return;
            case 2:
                org.telegram.ui.Components.d5.t0(8, this.f14916b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f14916b);
                return;
        }
    }
}
