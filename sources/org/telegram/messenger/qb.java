package org.telegram.messenger;
public final class qb implements Runnable {
    public final int f19376a;
    public final org.telegram.ui.ActionBar.o2 f19377b;

    public qb(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f19376a = i10;
        this.f19377b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f19376a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.f19377b);
                return;
            case 1:
                org.telegram.ui.Components.f5.t0(7, this.f19377b, null);
                return;
            case 2:
                org.telegram.ui.Components.f5.t0(8, this.f19377b, null);
                return;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f19377b);
                return;
        }
    }
}
