package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f18956a;
    public final long f18957b;
    public final long f18958c;
    public final BaseController d;

    public ld(BaseController baseController, long j10, long j11, int i10) {
        this.f18956a = i10;
        this.d = baseController;
        this.f18957b = j10;
        this.f18958c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18957b, this.f18958c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18957b, this.f18958c);
                return;
        }
    }
}
