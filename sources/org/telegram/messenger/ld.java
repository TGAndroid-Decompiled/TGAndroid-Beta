package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f20587a;
    public final long f20588b;
    public final long f20589c;
    public final BaseController d;

    public ld(BaseController baseController, long j10, long j11, int i10) {
        this.f20587a = i10;
        this.d = baseController;
        this.f20588b = j10;
        this.f20589c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20587a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f20588b, this.f20589c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f20588b, this.f20589c);
                return;
        }
    }
}
