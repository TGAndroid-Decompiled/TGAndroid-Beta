package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f17879a;
    public final long f17880b;
    public final long f17881c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f17879a = i10;
        this.d = baseController;
        this.f17880b = j3;
        this.f17881c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17879a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17880b, this.f17881c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17880b, this.f17881c);
                return;
        }
    }
}
