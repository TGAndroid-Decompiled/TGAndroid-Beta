package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f18687a;
    public final long f18688b;
    public final long f18689c;
    public final BaseController d;

    public jd(BaseController baseController, long j10, long j11, int i10) {
        this.f18687a = i10;
        this.d = baseController;
        this.f18688b = j10;
        this.f18689c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18687a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18688b, this.f18689c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18688b, this.f18689c);
                return;
        }
    }
}
