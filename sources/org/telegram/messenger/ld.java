package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f20603a;
    public final long f20604b;
    public final long f20605c;
    public final BaseController d;

    public ld(BaseController baseController, long j10, long j11, int i10) {
        this.f20603a = i10;
        this.d = baseController;
        this.f20604b = j10;
        this.f20605c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20603a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f20604b, this.f20605c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f20604b, this.f20605c);
                return;
        }
    }
}
