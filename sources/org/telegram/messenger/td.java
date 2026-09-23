package org.telegram.messenger;
public final class td implements Runnable {
    public final int f17370a;
    public final org.telegram.ui.ActionBar.n2 f17371b;

    public td(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f17370a = i10;
        this.f17371b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f17370a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17371b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f17371b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f17371b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17371b);
                return;
        }
    }
}
