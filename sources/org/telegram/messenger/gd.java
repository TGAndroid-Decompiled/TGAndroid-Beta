package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f17959a;
    public final long f17960b;
    public final long f17961c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f17959a = i10;
        this.d = baseController;
        this.f17960b = j3;
        this.f17961c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17959a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17960b, this.f17961c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17960b, this.f17961c);
                return;
        }
    }
}
