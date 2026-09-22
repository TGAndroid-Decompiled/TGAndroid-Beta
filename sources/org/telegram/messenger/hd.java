package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f16321a;
    public final long f16322b;
    public final long f16323c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f16321a = i10;
        this.d = baseController;
        this.f16322b = j3;
        this.f16323c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16321a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16322b, this.f16323c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16322b, this.f16323c);
                return;
        }
    }
}
