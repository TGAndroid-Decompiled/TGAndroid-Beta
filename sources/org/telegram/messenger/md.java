package org.telegram.messenger;
public final class md implements Runnable {
    public final int f17868a;
    public final long f17869b;
    public final long f17870c;
    public final BaseController d;

    public md(BaseController baseController, long j10, long j11, int i10) {
        this.f17868a = i10;
        this.d = baseController;
        this.f17869b = j10;
        this.f17870c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17868a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f17869b, this.f17870c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f17869b, this.f17870c);
                return;
        }
    }
}
