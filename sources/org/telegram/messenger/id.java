package org.telegram.messenger;
public final class id implements Runnable {
    public final int f18600a;
    public final long f18601b;
    public final long f18602c;
    public final BaseController d;

    public id(BaseController baseController, long j10, long j11, int i10) {
        this.f18600a = i10;
        this.d = baseController;
        this.f18601b = j10;
        this.f18602c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18601b, this.f18602c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18601b, this.f18602c);
                return;
        }
    }
}
