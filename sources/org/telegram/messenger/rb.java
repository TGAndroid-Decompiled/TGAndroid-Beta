package org.telegram.messenger;
public final class rb implements Runnable {
    public final int f17986a;
    public final org.telegram.ui.ActionBar.m2 f17987b;

    public rb(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f17986a = i10;
        this.f17987b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f17986a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f17987b);
                return;
            case 1:
                org.telegram.ui.Components.g5.s0(7, this.f17987b, null);
                return;
            case 2:
                org.telegram.ui.Components.g5.s0(8, this.f17987b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f17987b);
                return;
        }
    }
}
