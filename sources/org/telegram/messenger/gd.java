package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f17963a;
    public final long f17964b;
    public final long f17965c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f17963a = i10;
        this.d = baseController;
        this.f17964b = j3;
        this.f17965c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17963a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17964b, this.f17965c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17964b, this.f17965c);
                return;
        }
    }
}
