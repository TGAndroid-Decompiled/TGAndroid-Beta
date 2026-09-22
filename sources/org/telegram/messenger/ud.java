package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f17697a;
    public final org.telegram.ui.ActionBar.n2 f17698b;

    public ud(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f17697a = i10;
        this.f17698b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f17697a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17698b);
                return;
            case 1:
                org.telegram.ui.Components.d5.t0(7, this.f17698b, null);
                return;
            case 2:
                org.telegram.ui.Components.d5.t0(8, this.f17698b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17698b);
                return;
        }
    }
}
