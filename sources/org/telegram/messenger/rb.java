package org.telegram.messenger;
public final class rb implements Runnable {
    public final int f19448a;
    public final org.telegram.ui.ActionBar.o2 f19449b;

    public rb(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f19448a = i10;
        this.f19449b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f19448a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f19449b);
                return;
            case 1:
                org.telegram.ui.Components.d5.s0(7, this.f19449b, null);
                return;
            case 2:
                org.telegram.ui.Components.d5.s0(8, this.f19449b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19449b);
                return;
        }
    }
}
