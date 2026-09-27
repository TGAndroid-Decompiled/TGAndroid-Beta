package org.telegram.messenger;
public final class td implements Runnable {
    public final int f17617a;
    public final org.telegram.ui.ActionBar.o2 f17618b;

    public td(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f17617a = i10;
        this.f17618b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f17617a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17618b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f17618b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f17618b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17618b);
                return;
        }
    }
}
