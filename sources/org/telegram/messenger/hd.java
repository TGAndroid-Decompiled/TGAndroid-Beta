package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f16567a;
    public final long f16568b;
    public final long f16569c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f16567a = i10;
        this.d = baseController;
        this.f16568b = j3;
        this.f16569c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16567a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16568b, this.f16569c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16568b, this.f16569c);
                return;
        }
    }
}
