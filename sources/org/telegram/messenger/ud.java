package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f17471a;
    public final org.telegram.ui.ActionBar.o2 f17472b;

    public ud(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f17471a = i10;
        this.f17472b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f17471a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f17472b);
                return;
            case 1:
                org.telegram.ui.Components.c5.t0(7, this.f17472b, null);
                return;
            case 2:
                org.telegram.ui.Components.c5.t0(8, this.f17472b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17472b);
                return;
        }
    }
}
