package org.telegram.messenger;
public final class kd implements Runnable {
    public final int f19166a;
    public final long f19167b;
    public final long f19168c;
    public final BaseController d;

    public kd(BaseController baseController, long j10, long j11, int i10) {
        this.f19166a = i10;
        this.d = baseController;
        this.f19167b = j10;
        this.f19168c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19166a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f19167b, this.f19168c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f19167b, this.f19168c);
                return;
        }
    }
}
