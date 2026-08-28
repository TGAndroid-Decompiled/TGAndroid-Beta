package org.telegram.messenger;
public final class cd implements Runnable {
    public final int f19988a;
    public final long f19989b;
    public final long f19990c;
    public final BaseController d;

    public cd(BaseController baseController, long j10, long j11, int i9) {
        this.f19988a = i9;
        this.d = baseController;
        this.f19989b = j10;
        this.f19990c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19988a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f19989b, this.f19990c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f19989b, this.f19990c);
                return;
        }
    }
}
