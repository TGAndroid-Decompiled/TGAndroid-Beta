package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f18689a;
    public final long f18690b;
    public final long f18691c;
    public final BaseController d;

    public jd(BaseController baseController, long j10, long j11, int i10) {
        this.f18689a = i10;
        this.d = baseController;
        this.f18690b = j10;
        this.f18691c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18689a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18690b, this.f18691c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18690b, this.f18691c);
                return;
        }
    }
}
