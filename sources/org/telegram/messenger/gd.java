package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f17964a;
    public final long f17965b;
    public final long f17966c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f17964a = i10;
        this.d = baseController;
        this.f17965b = j3;
        this.f17966c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17964a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17965b, this.f17966c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17965b, this.f17966c);
                return;
        }
    }
}
