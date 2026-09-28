package org.telegram.messenger;
public final class td implements Runnable {
    public final int f17623a;
    public final org.telegram.ui.ActionBar.m2 f17624b;

    public td(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f17623a = i10;
        this.f17624b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f17623a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17624b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f17624b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f17624b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17624b);
                return;
        }
    }
}
