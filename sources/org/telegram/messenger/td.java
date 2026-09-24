package org.telegram.messenger;
public final class td implements Runnable {
    public final int f17608a;
    public final org.telegram.ui.ActionBar.m2 f17609b;

    public td(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f17608a = i10;
        this.f17609b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f17608a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17609b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f17609b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f17609b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17609b);
                return;
        }
    }
}
