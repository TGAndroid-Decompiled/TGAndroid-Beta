package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f20675a;
    public final long f20676b;
    public final long f20677c;
    public final BaseController d;

    public jd(BaseController baseController, long j10, long j11, int i10) {
        this.f20675a = i10;
        this.d = baseController;
        this.f20676b = j10;
        this.f20677c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20675a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f20676b, this.f20677c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f20676b, this.f20677c);
                return;
        }
    }
}
