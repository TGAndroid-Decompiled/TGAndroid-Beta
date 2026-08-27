package org.telegram.messenger;

public final class td implements Runnable {

    public final int f21633a;

    public final org.telegram.ui.ActionBar.n2 f21634b;

    public td(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f21633a = i10;
        this.f21634b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f21633a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.f21634b);
                break;
            case 1:
                org.telegram.ui.Components.y4.t0(7, this.f21634b, null);
                break;
            case 2:
                org.telegram.ui.Components.y4.t0(8, this.f21634b, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f21634b);
                break;
        }
    }
}
