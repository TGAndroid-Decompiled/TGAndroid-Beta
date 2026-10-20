package org.telegram.messenger;
public final class ob implements Runnable {
    public final int f19137a;
    public final org.telegram.ui.ActionBar.n2 f19138b;

    public ob(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19137a = i10;
        this.f19138b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f19137a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f19138b);
                return;
            case 1:
                org.telegram.ui.Components.f5.s0(7, this.f19138b, null);
                return;
            case 2:
                org.telegram.ui.Components.f5.s0(8, this.f19138b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19138b);
                return;
        }
    }
}
