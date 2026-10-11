package org.telegram.messenger;
public final class ob implements Runnable {
    public final int f18728a;
    public final org.telegram.ui.ActionBar.m2 f18729b;

    public ob(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f18728a = i10;
        this.f18729b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f18728a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f18729b);
                return;
            case 1:
                org.telegram.ui.Components.g5.s0(7, this.f18729b, null);
                return;
            case 2:
                org.telegram.ui.Components.g5.s0(8, this.f18729b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f18729b);
                return;
        }
    }
}
