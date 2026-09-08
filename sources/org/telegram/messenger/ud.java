package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f19177a;
    public final org.telegram.ui.ActionBar.n2 f19178b;

    public ud(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19177a = i10;
        this.f19178b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f19177a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f19178b);
                return;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.f19178b, null);
                return;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.f19178b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19178b);
                return;
        }
    }
}
