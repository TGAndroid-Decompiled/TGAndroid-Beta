package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f16476a;
    public final long f16477b;
    public final long f16478c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f16476a = i10;
        this.d = baseController;
        this.f16477b = j3;
        this.f16478c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16476a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16477b, this.f16478c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16477b, this.f16478c);
                return;
        }
    }
}
