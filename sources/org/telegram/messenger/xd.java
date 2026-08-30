package org.telegram.messenger;
public final class xd implements Runnable {
    public final int f18981a;
    public final org.telegram.ui.ActionBar.p2 f18982b;

    public xd(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f18981a = i10;
        this.f18982b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f18981a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f18982b);
                return;
            case 1:
                org.telegram.ui.Components.z4.t0(7, this.f18982b, null);
                return;
            case 2:
                org.telegram.ui.Components.z4.t0(8, this.f18982b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f18982b);
                return;
        }
    }
}
