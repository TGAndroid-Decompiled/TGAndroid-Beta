package org.telegram.messenger;
public final class td implements Runnable {
    public final int f19246a;
    public final org.telegram.ui.ActionBar.n2 f19247b;

    public td(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19246a = i10;
        this.f19247b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f19246a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f19247b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f19247b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f19247b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19247b);
                return;
        }
    }
}
