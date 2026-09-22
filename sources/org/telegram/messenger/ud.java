package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f17460a;
    public final org.telegram.ui.ActionBar.n2 f17461b;

    public ud(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f17460a = i10;
        this.f17461b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f17460a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17461b);
                return;
            case 1:
                org.telegram.ui.Components.c5.t0(7, this.f17461b, null);
                return;
            case 2:
                org.telegram.ui.Components.c5.t0(8, this.f17461b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17461b);
                return;
        }
    }
}
