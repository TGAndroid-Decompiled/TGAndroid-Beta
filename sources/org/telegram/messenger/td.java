package org.telegram.messenger;
public final class td implements Runnable {
    public final int f19254a;
    public final org.telegram.ui.ActionBar.n2 f19255b;

    public td(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19254a = i10;
        this.f19255b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f19254a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f19255b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f19255b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f19255b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19255b);
                return;
        }
    }
}
