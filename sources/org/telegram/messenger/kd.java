package org.telegram.messenger;
public final class kd implements Runnable {
    public final int f19168a;
    public final long f19169b;
    public final long f19170c;
    public final BaseController d;

    public kd(BaseController baseController, long j10, long j11, int i10) {
        this.f19168a = i10;
        this.d = baseController;
        this.f19169b = j10;
        this.f19170c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19168a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f19169b, this.f19170c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f19169b, this.f19170c);
                return;
        }
    }
}
