package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f17906a;
    public final long f17907b;
    public final long f17908c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f17906a = i10;
        this.d = baseController;
        this.f17907b = j3;
        this.f17908c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17906a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17907b, this.f17908c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17907b, this.f17908c);
                return;
        }
    }
}
