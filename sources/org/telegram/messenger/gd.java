package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f16468a;
    public final long f16469b;
    public final long f16470c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f16468a = i10;
        this.d = baseController;
        this.f16469b = j3;
        this.f16470c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16468a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16469b, this.f16470c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16469b, this.f16470c);
                return;
        }
    }
}
