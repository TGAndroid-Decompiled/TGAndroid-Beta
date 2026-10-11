package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f18300a;
    public final long f18301b;
    public final long f18302c;
    public final BaseController d;

    public jd(BaseController baseController, long j3, long j10, int i10) {
        this.f18300a = i10;
        this.d = baseController;
        this.f18301b = j3;
        this.f18302c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18300a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18301b, this.f18302c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18301b, this.f18302c);
                return;
        }
    }
}
