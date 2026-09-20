package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f17682a;
    public final org.telegram.ui.ActionBar.n2 f17683b;

    public ud(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f17682a = i10;
        this.f17683b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f17682a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17683b);
                return;
            case 1:
                org.telegram.ui.Components.d5.t0(7, this.f17683b, null);
                return;
            case 2:
                org.telegram.ui.Components.d5.t0(8, this.f17683b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17683b);
                return;
        }
    }
}
