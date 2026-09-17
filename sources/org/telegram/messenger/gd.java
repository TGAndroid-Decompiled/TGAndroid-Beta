package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f17822a;
    public final long f17823b;
    public final long f17824c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f17822a = i10;
        this.d = baseController;
        this.f17823b = j3;
        this.f17824c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17822a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17823b, this.f17824c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17823b, this.f17824c);
                return;
        }
    }
}
