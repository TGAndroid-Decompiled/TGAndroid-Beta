package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18958a;
    public final org.telegram.ui.ActionBar.n2 f18959b;

    public mb(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f18958a = i10;
        this.f18959b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f18958a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f18959b);
                return;
            case 1:
                org.telegram.ui.Components.f5.s0(7, this.f18959b, null);
                return;
            case 2:
                org.telegram.ui.Components.f5.s0(8, this.f18959b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f18959b);
                return;
        }
    }
}
