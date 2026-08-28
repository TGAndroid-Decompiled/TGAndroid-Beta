package org.telegram.messenger;
public final class pd implements Runnable {
    public final int f21236a;
    public final org.telegram.ui.ActionBar.o2 f21237b;

    public pd(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f21236a = i9;
        this.f21237b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f21236a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f21237b);
                return;
            case 1:
                org.telegram.ui.Components.y4.t0(7, this.f21237b, null);
                return;
            case 2:
                org.telegram.ui.Components.y4.t0(8, this.f21237b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f21237b);
                return;
        }
    }
}
