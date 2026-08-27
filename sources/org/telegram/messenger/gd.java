package org.telegram.messenger;

public final class gd implements Runnable {

    public final int f20380a;

    public final long f20381b;

    public final long f20382c;
    public final BaseController d;

    public gd(BaseController baseController, long j10, long j11, int i10) {
        this.f20380a = i10;
        this.d = baseController;
        this.f20381b = j10;
        this.f20382c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20380a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f20381b, this.f20382c);
                break;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f20381b, this.f20382c);
                break;
        }
    }
}
