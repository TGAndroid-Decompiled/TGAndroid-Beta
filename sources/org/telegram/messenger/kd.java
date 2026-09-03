package org.telegram.messenger;
public final class kd implements Runnable {
    public final int f17647a;
    public final long f17648b;
    public final long f17649c;
    public final BaseController d;

    public kd(BaseController baseController, long j10, long j11, int i10) {
        this.f17647a = i10;
        this.d = baseController;
        this.f17648b = j10;
        this.f17649c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17647a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17648b, this.f17649c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17648b, this.f17649c);
                return;
        }
    }
}
