package org.telegram.messenger;
public final class wd implements Runnable {
    public final int f22091a;
    public final org.telegram.ui.ActionBar.o2 f22092b;

    public wd(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f22091a = i10;
        this.f22092b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f22091a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f22092b);
                return;
            case 1:
                org.telegram.ui.Components.c5.t0(7, this.f22092b, null);
                return;
            case 2:
                org.telegram.ui.Components.c5.t0(8, this.f22092b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f22092b);
                return;
        }
    }
}
